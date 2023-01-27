# FUNDAMENTALS OF PROGRAMMING REPORT

</br>

## GROUP MEMBERS

- Abdullahi Ibrahim-S2181462
- Wang Tianren-S2187783
- Zuhair Mobasshar-S2167293
- Yulun Deng- S2190329

## Requirement analysis

From the source code provided, we choose to extract and display the errors included in the code, the time range for that, and the partition.

To elaborate, we chose three metrics to address which are:

- Number of jobs created/ended within the given time range.
- Number of jobs by partitions.
- Number of jobs causing error

## Architectural design

To solve the above problems, we developed the below code using java, using this code, we were able to extract all the useful information which solely includes the ones listed above. 

![image-20230125010418678](/home/megamu/snap/typora/76/.config/Typora/typora-user-images/image-20230125010418678.png)

Below are the snippets of our code:

### Main

~~~java
import java.io.*;
import java.text.ParseException;
import java.util.Scanner;

import parser.*;

import static UsrInterface.UsrInterface.*;
import static data_structure.data.*;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        String file_loc;
        Scanner key = new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println("*****  type the path of log file   *****");
        System.out.print("* > :");
        file_loc = key.next();
        System.out.println("****************************************");
        System.out.println("**********   loading files    **********");
        System.out.println("****************************************\n");
        int[] res = parse_file.readfile(file_loc, job_map);
        System.out.println("****************************************");
        System.out.println("**********      complete      **********");
        System.out.println("****************************************");
        System.out.println("* success : " + res[0]);
        System.out.println("* fail    : " + res[1]);
        main_page();
    }
}
~~~

### job filter

~~~java
package filter;

import org.jetbrains.annotations.NotNull;
import tech.tablesaw.api.Table;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class job_filter {
    public static void job_get_by_string(@NotNull Table jobs_table, String filter, String content) {
        if (jobs_table.containsColumn(filter)) {
            Table result = jobs_table.where(jobs_table.stringColumn(filter).isEqualTo(content));
            System.out.println(result);
        } else {
            System.out.println("No such Column");
        }

    }

    public static void job_get_by_time(@NotNull Table jobs_table, String filter, String start, String end) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start_t = LocalDate.parse(start, fmt);
        LocalDate end_t = LocalDate.parse(end, fmt);
        Table result_p = jobs_table.where(jobs_table.dateColumn(filter).isAfter(start_t));
        Table result = result_p.where(result_p.dateColumn(filter).isBefore(end_t));
        System.out.println(result);
    }
}
~~~

### parse file 

~~~java
package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static parser.slurm_error.add_error;

public class parse_file {
    public static int[] readfile(String fileloc, HashMap<Integer, slurm_job> job_map) {
        int parse_fail = 0, parse_success = 0;
        try {
            Scanner file_scanner = new Scanner(new File(fileloc));
            while (file_scanner.hasNextLine()) {
                String line = file_scanner.nextLine() + " ";
                //System.out.println(line);
                int JobId = 0, InitPrio = 0, usec = 0, uid = 0, CPUs = 0, association = 0;
                String NodeList = "", Partition = "", status = "", account = "", user = "";
                String time = "";

                int marker = 0;

                // [2022-06-01T01:02:35.148] _slurm_rpc_submit_batch_job: JobId=42802 InitPrio=19758 usec=589
                String submit_p = "\\[(.*T.*)\\] _slurm_rpc_submit_batch_job: JobId=([0-9]*) InitPrio=([0-9]*) usec=([0-9]*)";
                Pattern submit = Pattern.compile(submit_p);
                // [2022-06-01T01:02:36.012] sched: Allocate JobId=42802 NodeList=gpu05 #CPUs=32 Partition=gpu-v100s
                String sched_p = "\\[(.*T.*)\\] sched: Allocate JobId=([0-9]*) NodeList=(.*?) #CPUs=([0-9]*) Partition=(.*)";
                Pattern sched = Pattern.compile(sched_p);
                //[2022-06-01T04:05:04.581] _job_complete: JobId=42801 WEXITSTATUS 2
                String complete_p = "\\[(.*T.*)\\] _job_complete: JobId=([0-9]*) (.*)";
                Pattern complete = Pattern.compile(complete_p);
                // [2022-06-01T10:39:24.178] _slurm_rpc_kill_job: REQUEST_KILL_JOB JobId=42819 uid 548200029
                String kill_p = "\\[(.*T.*)\\] _slurm_rpc_kill_job: REQUEST_KILL_JOB JobId=([0-9]*) uid ([0-9]*)";
                Pattern kill = Pattern.compile(kill_p);

                // [2022-06-01T15:12:23.290] error_filter: This association 187(account='free', user='lobbeytan', job_filter='(null)') does not have access to qos long
                String error_p = "\\[(.*T.*)\\] error: This association ([0-9]*)\\(account='(.*)', user='(.*)', partition='(.*)'\\) (.*?)";
                Pattern error = Pattern.compile(error_p);

                Matcher m1 = submit.matcher(line);
                Matcher m2 = sched.matcher(line);
                Matcher m3 = complete.matcher(line);
                Matcher m4 = kill.matcher(line);
                Matcher m5 = error.matcher(line);

                try {
                    if (m1.find()) {
                        time = m1.group(1);
                        JobId = Integer.parseInt(m1.group(2));
                        InitPrio = Integer.parseInt(m1.group(3));
                        usec = Integer.parseInt(m1.group(4));
                        marker = 1;
                        System.out.println("* submit    \t\t match");
                        parse_success++;
                    } else if (m2.find()) {
                        time = m2.group(1);
                        JobId = Integer.parseInt(m2.group(2));
                        NodeList = m2.group(3);
                        CPUs = Integer.parseInt(m2.group(4));
                        Partition = m2.group(5);
                        marker = 2;
                        System.out.println("* sched     \t\t match");
                        parse_success++;
                    } else if (m3.find()) {
                        time = m3.group(1);
                        JobId = Integer.parseInt(m3.group(2));
                        status = m3.group(3);
                        marker = 3;
                        System.out.println("* complete  \t\t match");
                        parse_success++;
                    } else if (m4.find()) {
                        time = m4.group(1);
                        JobId = Integer.parseInt(m4.group(2));
                        uid = Integer.parseInt(m4.group(3));
                        System.out.println("* kill      \t\t match");
                        parse_success++;
                    } else if (m5.find()) {
                        time = m5.group(1);
                        association = Integer.parseInt(m5.group(2));
                        account = m5.group(3);
                        user = m5.group(4);
                        Partition = m5.group(5);
                        add_error(time, association, account, user, Partition);
                        System.out.println("* error     \t\t match");
                        parse_success++;
                    } else {
                        System.out.println("* matcher   \t\t failed");
                        parse_fail++;
                    }
                } catch (IllegalStateException e) {
                    continue;
                }

                if (JobId != 0) {
                    if (job_map.containsKey(JobId)) {
                        if (marker == 1) {
                            job_map.get(JobId).add_time(time);
                            job_map.get(JobId).InitPrio = InitPrio;
                            job_map.get(JobId).usec = usec;
                            job_map.get(JobId).add_time(time);
                        } else if (marker == 2) {
                            job_map.get(JobId).add_time(time);
                            job_map.get(JobId).NodeList = NodeList;
                            job_map.get(JobId).CPUs = CPUs;
                            job_map.get(JobId).Partition = Partition;
                        } else if (marker == 3) {
                            job_map.get(JobId).add_time(time);
                            job_map.get(JobId).end(status);
                        }
                    } else {
                        slurm_job job = new slurm_job(JobId);
                        job_map.put(JobId, job);
                        if (marker == 1) {
                            job_map.get(JobId).add_time(time);
                            job_map.get(JobId).InitPrio = InitPrio;
                            job_map.get(JobId).usec = usec;
                            job_map.get(JobId).add_time(time);
                        } else if (marker == 2) {
                            job_map.get(JobId).add_time(time);
                            job_map.get(JobId).NodeList = NodeList;
                            job_map.get(JobId).CPUs = CPUs;
                            job_map.get(JobId).Partition = Partition;
                        } else if (marker == 3) {
                            job_map.get(JobId).add_time(time);
                            job_map.get(JobId).end(status);
                        }
                    }
                }
            }
            file_scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new int[]{parse_success, parse_fail};
    }
}
~~~
### data structure
~~~java
package data_structure;

import parser.slurm_job;
import tech.tablesaw.api.DateColumn;
import tech.tablesaw.api.IntColumn;
import tech.tablesaw.api.StringColumn;
import tech.tablesaw.api.Table;

import java.util.HashMap;

public class data {
    public static HashMap<Integer, slurm_job> job_map = new HashMap<Integer, slurm_job>();
    public static Table jobs = Table.create("Jobs table").addColumns(
            IntColumn.create("JobId"),
            StringColumn.create("Main"),
            IntColumn.create("InitPrio"),
            IntColumn.create("usec"),
            IntColumn.create("uid"),
            StringColumn.create("NodeList"),
            IntColumn.create("CPUs"),
            StringColumn.create("Partition"),
            StringColumn.create("status"),
            DateColumn.create("start"),
            DateColumn.create("end")
    );

    public static Table errors = Table.create("Errors").addColumns(
            DateColumn.create("job_time"),
            IntColumn.create("association"),
            StringColumn.create("account"),
            StringColumn.create("user"),
            StringColumn.create("Partition")
    );
}
~~~

### time formatter

~~~java
package formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time_formatter {
    public static LocalDateTime toLocalDateTime(String dateTime) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        LocalDateTime ldt = LocalDateTime.parse(dateTime, df);
        return ldt;
    }
}
~~~

### UI

~~~java
package UsrInterface;

import java.util.Objects;
import java.util.Scanner;

import static data_structure.data.errors;
import static data_structure.data.jobs;
import static filter.error_filter.err_get_by_string;
import static filter.error_filter.err_get_by_time;
import static filter.job_filter.job_get_by_string;
import static filter.job_filter.job_get_by_time;

public class UsrInterface {
    public static void main_page() {
        System.out.println("****************************************");
        System.out.println("* 1 : show data");
        System.out.println("* 2 : filter data by Column Name");
        System.out.println("* 3 : filter data by Time (yyyy-MM-dd) ");
        System.out.println("* q : quit");
        System.out.println("****************************************");
        System.out.print("* > : ");
        Scanner key = new Scanner(System.in);
        String choice = key.nextLine();
        if (Objects.equals(choice, "1")) {
            System.out.println("****************************************");
            System.out.print("choose the data sheet you want (jobs/errors) : ");
            String name = key.nextLine();
            show_data(name);
        } else if (Objects.equals(choice, "2")) {
            System.out.println("****************************************");
            System.out.print("choose the data sheet you want (jobs/errors) : ");
            String name = key.nextLine();
            System.out.print("type the filter you want  : ");
            String filter = key.nextLine();
            System.out.print("type the content you want : ");
            String content = key.nextLine();
            filter_by_str(name, filter, content);
        } else if (Objects.equals(choice, "3")) {
            System.out.println("****************************************");
            System.out.print("choose the data sheet you want (jobs/errors) : ");
            String name = key.nextLine();
            System.out.print("type the start time you want : ");
            String start = key.nextLine();
            System.out.print("type the end time you want   : ");
            String end = key.nextLine();
            filter_by_time(name, start, end);
        } else if (Objects.equals(choice, "q")) {
            return;
        } else {
            System.out.print("Unknown key");
            main_page();
        }
    }

    public static void show_data(String name) {
        if (Objects.equals(name, "jobs")) {
            System.out.println(jobs);
        } else if (Objects.equals(name, "errors")) {
            System.out.println(errors);
        } else {
            System.out.println("Unknown data name");
        }
        Scanner key = new Scanner(System.in);
        String input = key.nextLine();
        if (Objects.equals(input, "q")) {
            main_page();
        }
    }

    public static void filter_by_str(String name, String filter, String content) {
        if (Objects.equals(name, "jobs")) {
            job_get_by_string(jobs, filter, content);
        } else if (Objects.equals(name, "errors")) {
            err_get_by_string(errors, filter, content);
        } else {
            System.out.println("Unknown data name");
        }
        Scanner key = new Scanner(System.in);
        String input = key.nextLine();
        if (Objects.equals(input, "q")) {
            main_page();
        }
    }

    public static void filter_by_time(String name, String start, String end) {
        Scanner key = new Scanner(System.in);
        if (Objects.equals(name, "jobs")) {
            System.out.print(" - which time to select(start/end):");
            String filter=key.nextLine();
            job_get_by_time(jobs, filter, start, end);
        } else if (Objects.equals(name, "errors")) {
            err_get_by_time(errors, start, end);
        } else {
            System.out.println("Unknown data name");
        }
        String input = key.nextLine();
        if (Objects.equals(input, "q")) {
            main_page();
        }
    }

}
~~~

## Result and findings

We found out that several jobs were submitted, allocated resources, and completed and some were killed. We can also see that different jobs were allocated different resources like CPU and GPU and different partitions, which is good for resource management. Also, we can see that the job completions have a WEXITSTATUS that shows the status of the job whether it was completed successfully or not, and the user who submitted the job.

However, as the log data is not complete and only represents a small period of time, it's hard to draw any significant conclusions or insights from it. To truly understand the performance and usage of the scheduler, it would be necessary to analyze a larger dataset over a longer period of time.

## Major Problems faced

Firstly, the major challenges we faced while developing the code to find our solution were;

- Due to the length of the source code, a lot of time was consumed while analyzing it.
- As we were working under a time limit, we kept making some errors or mistakes which is mostly due to us being nervous and tense.

## Sample output of the program

![](/home/megamu/Pictures/Screenshots/Screenshot from 2023-01-24 23-55-57.png)

![](/home/megamu/Pictures/Screenshots/Screenshot from 2023-01-24 23-50-25.png)

![](/home/megamu/Pictures/Screenshots/Screenshot from 2023-01-24 23-49-52.png)

![](/home/megamu/Pictures/Screenshots/Screenshot from 2023-01-24 23-50-45.png)

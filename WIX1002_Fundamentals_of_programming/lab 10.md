# 1
~~~java
package L10;

public class L10Q1 {
    public abstract class EmployeeSalary {

        public String NAME;

        public EmployeeSalary(String name) {
            this.NAME = name;
        }

        public abstract void displayDetails();
    }

    public class ContractStaff extends EmployeeSalary {

        protected final double SALARY = 500;
        protected double sales, commission;

        // Constructor
        public ContractStaff(String name, double sales) {
            super(name);
            this.sales = sales;
            this.commission = this.sales * 0.5;
        }

        public void displayDetails() {
            System.out.printf("\nContract Staff\n===\nName: %s\nSalary Per Month: %.2f\nSales: %.2f\nCommission: %.2f\n", this.NAME, this.SALARY, this.sales, this.commission);
        }
    }

    public class PermanentEmployee extends EmployeeSalary {

        protected final String CATEGORY;
        protected final double SALARY_MONTH;

        public PermanentEmployee(String name, String category) {
            super(name);
            this.CATEGORY = category;
            this.SALARY_MONTH = (category.equalsIgnoreCase("A")) ? 4000 : (category.equalsIgnoreCase("B")) ? 3000 : (category.equalsIgnoreCase("C")) ? 2000 : 0;
        }

        // Methods
        public void displayDetails() {
            System.out.printf("\nPermanent Employee\n===\nName: %s\nCategory: %s\nSalary Per Month: %.2f\n", this.NAME, this.CATEGORY, this.SALARY_MONTH);
        }
    }

    public class TemporaryStaff extends EmployeeSalary {

        protected double salary;

        public TemporaryStaff(String name, double workHours) {
            super(name);
            this.salary = 15 * workHours;
        }

        public void displayDetails() {
            System.out.printf("\nTemporary Employee\n===\nName: %s\nSalary Per Month: %.2f\n", this.NAME, this.salary);
        }
    }
}

~~~

# 2

~~~java
package L10;

import java.io.*;

public class L10Q2 {

    public interface MessageEncoder {
        public String encode(String plainText);

        public String decode(String cipherText);
    }

    public class SubstitutionCipher implements MessageEncoder {

        protected String inputPath, outputPath;
        protected int shiftAmount;


        public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
            this.inputPath = "./L10Q2/io_files/" + inputFileName;
            this.outputPath = "./L10Q2/io_files/" + outputFileName;
            this.shiftAmount = shift;
        }


        public String encode(String plainText) {
            String encodedMessage = "";
            for (int i = 0; i < plainText.length(); i++) {
                encodedMessage += (char) (plainText.charAt(i) + this.shiftAmount);
            }
            return encodedMessage;
        }

        public String decode(String cipherText) {
            String encodedMessage = "";
            for (int i = 0; i < cipherText.length(); i++) {
                encodedMessage += (char) (cipherText.charAt(i) - this.shiftAmount);
            }
            return encodedMessage;
        }

        public void convertFrom(String type) {
            try {
                BufferedReader file = new BufferedReader(new FileReader(this.inputPath));
                FileWriter output = new FileWriter(this.outputPath);
                String content = "", converted = "", thisLine;

                while ((thisLine = file.readLine()) != null) {
                    content += thisLine + "\n";
                }
                if (type.toLowerCase().contains("plain")) {
                    converted = this.encode(content);
                } else if (type.toLowerCase().contains("cipher")) {
                    converted = this.decode(content);
                }

                output.write(converted);
                file.close();
                output.close();
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found!");
            } catch (IOException e) {
                System.out.printf("IO Exception: %s\n", e);
            }
        }
    }

}

~~~

# 3

~~~java
package L10;

import java.io.*;

public class L10Q3 {

    public interface MessageEncoder {
        public String encode(String plainText);

        public String decode(String cipherText);
    }

    public class ShuffleCipher implements MessageEncoder {

        protected String inputPath, outputPath;
        protected int shuffleCount;

        // Constructor
        public ShuffleCipher(String inputFileName, String outputFileName, int N) {
            this.inputPath =  inputFileName;
            this.outputPath =  outputFileName;
            this.shuffleCount = N;
        }

        // Methods
        @Override
        public String encode(String plainText) {
            String left = plainText.substring(0, plainText.length() / 2), right = plainText.substring(plainText.length() / 2), shuffled = "";
            for (int i = 0; i < Math.max(left.length(), right.length()); i++) {
                if (i < left.length()) {
                    shuffled += left.charAt(i);
                }
                shuffled += right.charAt(i);
            }
            return shuffled;
        }

        @Override
        public String decode(String cipherText) {
            String left = "", right = "";
            int alternateLength = cipherText.length() / 2 * 2;
            for (int i = 0; i < alternateLength; i += 2) {
                left += cipherText.charAt(i);
                right += cipherText.charAt(i + 1);
            }
            if (cipherText.length() % 2 != 0) {
                return left + right + cipherText.charAt(cipherText.length() - 1);
            }
            return left + right;
        }

        public void shuffleFrom(String type) {

            try {
                BufferedReader file = new BufferedReader(new FileReader(this.inputPath));
                FileWriter output = new FileWriter(this.outputPath);
                String content = "", thisLine;

                while ((thisLine = file.readLine()) != null) {
                    content += thisLine + "\n";
                }
                for (int i = 0; i < this.shuffleCount; i++) {
                    if (type.toLowerCase().contains("normal")) {
                        content = encode(content);
                    } else if (type.toLowerCase().contains("shuffle")) {
                        content = decode(content);
                    }
                }

                output.write(content);
                file.close();
                output.close();
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found!");
            } catch (IOException e) {
                System.out.printf("IO Exception: %s\n", e);
            }
        }
    }
}

~~~

# 4

~~~java
package L10;

import java.io.*;
import java.time.LocalDateTime;

public class L10Q4 {
    public interface Searchable {
        public boolean search(String dateStartTime, String dateEndTime);
    }

    public void book(String dateStartTime, String dateEndTime, String Filename) {
        try {
            FileWriter file = new FileWriter(Filename, true);
            String appointment = String.format("%s,%s\n", dateStartTime, dateEndTime);
            if (this.search(dateStartTime, dateEndTime)) {
                file.write(appointment);
                System.out.println("Appointment Booked!");
            } else {
                System.out.println("There are other appointments already!");
            }
            file.close();
        } catch (IOException e) {
            System.out.printf("IO Exception: %s\n", e);
        }
    }

    @Override
    public boolean search(String dateStartTime, String dateEndTime, String Filename) {
        boolean isAvailable = true;
        try {
            BufferedReader file = new BufferedReader(new FileReader(Filename));
            String thisLine;
            while ((thisLine = file.readLine()) != null) {
                if (!this.noCrash(dateStartTime, dateEndTime, thisLine)) {
                    isAvailable = false;
                    break;
                }
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.printf("IO Exception: %s\n", e);
        }
        return isAvailable;
    }

    private boolean noCrash(String dateStartTime, String dateEndTime, String fileTime) {
        String start = fileTime.split(",")[0], end = fileTime.split(",")[1];
        LocalDateTime date_start = LocalDateTime.of(Integer.parseInt(dateStartTime.substring(4, 8)), Integer.parseInt(dateStartTime.substring(2, 4)), Integer.parseInt(dateStartTime.substring(0, 2)), Integer.parseInt(dateStartTime.substring(9)), 0, 0);
        LocalDateTime date_end = LocalDateTime.of(Integer.parseInt(dateEndTime.substring(4, 8)), Integer.parseInt(dateEndTime.substring(2, 4)), Integer.parseInt(dateEndTime.substring(0, 2)), Integer.parseInt(dateEndTime.substring(9)), 0, 0);
        LocalDateTime line_start = LocalDateTime.of(Integer.parseInt(start.substring(4, 8)), Integer.parseInt(start.substring(2, 4)), Integer.parseInt(start.substring(0, 2)), Integer.parseInt(start.substring(9)), 0, 0);
        LocalDateTime line_end = LocalDateTime.of(Integer.parseInt(end.substring(4, 8)), Integer.parseInt(end.substring(2, 4)), Integer.parseInt(end.substring(0, 2)), Integer.parseInt(end.substring(9)), 0, 0);
        return date_end.isBefore(line_start) || date_start.isAfter(line_end);
    }
}
}

~~~


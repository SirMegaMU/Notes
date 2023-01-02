package L4;

import java.util.Scanner;

public class L44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();
        System.out.print("First day of year (monday - sunday): ");
        String first_day = scan.next();

        month_calender(year, first_day, 4);
        month_calender(year, first_day, 7);
    }

    static void month_calender(int year, String first_day, int month) {

        first_day = first_day.toLowerCase();

        int[] month_day = new int[12];
        month_day[0] = 31;
        if (year % 4 == 0) {
            month_day[1] = 29;
        } else {
            month_day[1] = 28;
        }
        month_day[2] = 31;
        month_day[3] = 30;
        month_day[4] = 31;
        month_day[5] = 30;
        month_day[6] = 31;
        month_day[7] = 31;
        month_day[8] = 30;
        month_day[9] = 31;
        month_day[10] = 30;
        month_day[11] = 31;
        //month
        String month_name = null;
        switch (month) {
            case 0:
                month_name = "January";
                break;

            case 1:
                month_name = "February";
                break;

            case 2:
                month_name = "March";
                break;

            case 3:
                month_name = "April";
                break;

            case 4:
                month_name = "May";
                break;

            case 5:
                month_name = "June";
                break;

            case 6:
                month_name = "July";
                break;

            case 7:
                month_name = "August";
                break;

            case 8:
                month_name = "September";
                break;

            case 9:
                month_name = "October";
                break;

            case 10:
                month_name = "November";
                break;

            case 11:
                month_name = "December";
                break;
        }
        //day
        int skip = 0;
        switch (first_day) {
            case "sunday":
                skip += 0;
                break;

            case "monday":
                skip += 1;
                break;

            case "tuesday":
                skip += 2;
                break;

            case "wednesday":
                skip += 3;
                break;

            case "thursday":
                skip += 4;
                break;

            case "friday":
                skip += 5;
                break;

            case "saturday":
                skip += 6;
                break;
        }
        System.out.println();
        System.out.println(month_name + " Calender");
        System.out.println("S\tM\tT\tW\tT\tF\tS");

        int total_day_to = skip;
        for (int day_to = 0; day_to <= month - 1; day_to++) {
            total_day_to += month_day[day_to];
        }
        int remainder = (total_day_to % 7);
        if (remainder == 0) {
            remainder = 6;
        } else {
            remainder = remainder - 1;
        }
        int day_on_month = remainder + month_day[4];
        int temp_remainder_month = remainder;
        int temp_day_month = 1;
        for (int x = 1; x <= day_on_month; x++) {
            if (temp_remainder_month != 0) {
                System.out.print("\t");
                temp_remainder_month--;
            } else {
                System.out.print(temp_day_month + "\t");
                temp_day_month++;
            }
            if (x % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

}

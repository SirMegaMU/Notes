# lab 4

## 1

```java
import java.util.Scanner;

public class L41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int integer = input.nextInt();

        System.out.print("The factors are: ");
        for (int j = 1; j <= integer; j++) {
            if (integer % j == 0) {
                System.out.print(j + ", ");
            }
        }
    }
}
```

## 2

```java
import java.util.Scanner;

public class L42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int num = scan.nextInt();
        int sum = 0;
        for (int x = 1; x <= num; x++) {
            int res = 0;
            for (int y = 1; y <= x; y++) {
                res += y;
            }
            sum += res;
        }
        System.out.print(sum);
    }
}
```

## 3

```java
import java.util.Scanner;

public class L43 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double score = 0,count = 0,total = 0,totalOfSquares = 0;
        double min = 0,max = 0;

        while (score >= 0) {
            System.out.print("Enter a score [negative score to quit]:");
            score = keyboard.nextDouble();

            if (score >= 0) {
                total += score;
                totalOfSquares += (score * score);
                count++;
            }

            if (min == 0 && max == 0) {
                min = score;
                max = score;
            }
            if (score < min && score >= 0)
                min = score;
            if (score > max)
                max = score;
        }

        System.out.println("Total Score: " + total);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);

        double average = total / count;
        System.out.printf("Average Score: %.2f\n", average);

        double sd = Math.sqrt((totalOfSquares - (total * total) / count) / (count - 1));
        System.out.printf("Standard Deviation: %.2f\n", sd);
    }
}
```

## 4

```java
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
```

## 5

```java
import java.util.Random;

public class L45 {
    public static void main(String[] args) {
        int score = 0, dice;
        Boolean status = true;
        while (score < 100) {
            dice = (int) Math.random() * (6) + 1;
            score += dice;
            if (dice == 6) {
                continue;
            } else {
                status  = !status;
            }
        }
        if(status){
            System.out.println("A wins");
        } else {
            System.out.println("B wins");
        }
    }
}
```

## 6

```java
import java.util.Random;

public class L46 {
    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt();
        System.out.println(a);
        System.out.println(String.valueOf(a).length());
    }
}
```

## 7

```java
import java.util.Scanner;

public class L47 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double princ, rate, pay, n, month, princDue, rateDue, remain, monthDue, rateTot = 0;
        System.out.print("Enter principal amount: ");
        princ = key.nextDouble();
        System.out.print("Enter interest in %: ");
        rate = key.nextDouble();
        System.out.print("Enter total number of month(s): ");
        month = key.nextDouble();
        n = rate / 12 / 100;
        pay = (princ * n) / (1 - Math.pow((1 + n), -month));
        System.out.println("Month \t Monthly Payment \t Principal \t Interest \t Unpaid  Balance \t Total Interest");
        for (monthDue = 1; monthDue <= month; monthDue++) {
            princDue = pay * Math.pow((1 + n), -(1 + month - monthDue));
            rateDue = pay - princDue;
            rateTot += rateDue;
            remain = rateDue / n - princDue;
            System.out.printf("%.0f \t\t %.2f \t\t %.2f \t\t %.2f \t\t %.2f \t\t %.2f\n", monthDue, pay, princDue, rateDue, remain, rateTot);
        }
    }
}
```

## 8

```java
public class L48 {
    public static void main(String[] args) {
        int n, counter = 0, primeNum = 2;
        n = (int) (Math.random() * 100);

        System.out.println("First " + n + " prime numbers:");

        while (counter < n) {
            boolean isPrime = true;

            for (int i = 2; i < primeNum; i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(primeNum + "\t");
                counter++;
            }
            primeNum++;
        }
    }
}
```

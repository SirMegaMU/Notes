package L4;

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

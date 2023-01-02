package L2;

import java.util.Scanner;

public class L22 {
    public static void main(String[] args) {
        double P, D, R, Y, M;
        Scanner key = new Scanner(System.in);
        System.out.print("please enter The price of the car:");
        P = key.nextDouble();
        System.out.print("please enter Down payment:");
        D = key.nextDouble();
        System.out.print("please enter Interest Rate in %:");
        R = key.nextDouble();
        System.out.print("please enter Loan duration in year:");
        Y = key.nextDouble();
        M = (P - D) * (1 - R * Y / 100) / (Y * 12);
        System.out.printf("Monthly Payment:%.2f", M);
    }
}

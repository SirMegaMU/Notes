package L2;

import java.util.Scanner;

public class L26 {
    public static void main(String[] args) {
        float M, Q, final_T, init_T;
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram:");
        M = key.nextFloat() / 1000;
        System.out.print("Enter thr initial temperature in Fahrenheit:");
        init_T = key.nextFloat();
        System.out.print("Enter thr final temperature in Fahrenheit:");
        final_T = key.nextFloat();
        Q = M * (final_T - init_T) * 4184;
        System.out.println("The energy needed is " + Q);
    }
}

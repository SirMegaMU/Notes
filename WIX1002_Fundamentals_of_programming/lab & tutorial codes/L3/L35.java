package L3;

import java.util.Scanner;

public class L35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Simultaneous linear equations consists of 2 equations, ax + by = e and cx + dy = f");
        System.out.println("For ax + by = e, enter the values for a b e :");

        double a = input.nextDouble(), b = input.nextDouble(), e = input.nextDouble();

        System.out.println("For cx + dy = f, enter the values for c d f :");

        double c = input.nextDouble(),d = input.nextDouble(),f = input.nextDouble();

        if ((a * d) - (b * c) == 0) {
            System.out.println("no solution.");
        } else {
            System.out.println("x = " + (((e * d) - (b * f)) / ((a * d) - (b * c))));
            System.out.println("y = " + (((a * f) - (e * c)) / ((a * d) - (b * c))));
        }
    }
}

package T2;

import java.util.Scanner;

public class T26 {
    public static void main(String[] args) {
        double diameter;
        System.out.print("Enter the diameter:");
        Scanner keyboard = new Scanner(System.in);
        diameter = keyboard.nextDouble();
        System.out.printf("The circumference of the circle is: %.3f",diameter*2*Math.PI);
    }
}

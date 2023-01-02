package T2;

import java.util.Scanner;

public class T27 {
    public static void main(String[] args) {
        double inch;
        System.out.print("Enter value in inch:");
        Scanner keyboard = new Scanner(System.in);
        inch = keyboard.nextDouble();
        System.out.printf("%.2f inches = %.2f meters",inch,inch*2.54/100);
    }
}

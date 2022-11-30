package L2;

import java.util.Scanner;

public class L21 {
    public static void main(String[] args) {
        double cel,fah;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the temperature in degree Fahrenheit:");
        fah = key.nextDouble();
        cel = (fah-32)/1.8;
        System.out.printf("The temperature in Celsius is： %.2f",cel);
    }
}

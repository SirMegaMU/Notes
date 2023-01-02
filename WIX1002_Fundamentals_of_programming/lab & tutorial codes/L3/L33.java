package L3;

import java.util.Scanner;

public class L33 {
    public static class Main {
        public static void main(String[] args) {

            double sel, com;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the total sale : ");
            sel = s.nextDouble();

            if (sel <= 100) {
                com = 0.05 * sel;
                System.out.println("Commission = " + String.format("%.2f", com));
            } else if (sel > 100 && sel < 501) {
                com = 0.075 * sel;
                System.out.println("Commission = " + String.format("%.2f", com));
            } else if (sel > 500 && sel < 1001) {
                com = 0.1 * sel;
                System.out.println("Commission = " + String.format("%.2f", com));
            } else {
                com = 0.125 * sel;
                System.out.println("Commission = " + String.format("%.2f", com));
            }
        }
    }
}

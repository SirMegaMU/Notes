package L3;

import java.util.Scanner;

public class L31 {
    public static void main(String[] args) {
        int num1, num2, total = 0, i = 0;
        String operand = "+-*/%";
        char oprd;
        System.out.println("Enter two integer number: ");
        Scanner keyboard = new Scanner(System.in);
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        System.out.println("Enter the operand: ");
        oprd = keyboard.next().charAt(0);
        if (oprd == '+') {
            total = num1 + num2;
            i = 0;
        }
        if (oprd == '-') {
            total = num1 - num2;
            i = 1;
        }
        if (oprd == '*') {
            total = num1 * num2;
            i = 2;
        }
        if (oprd == '/') {
            total = num1 / num2;
            i = 3;
        }
        if (oprd == '%') {
            total = num1 % num2;
            i = 4;
        }
        System.out.printf("%d %c %d = %d", num1, operand.charAt(i), num2, total);
    }
}


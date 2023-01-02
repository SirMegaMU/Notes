package L4;

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

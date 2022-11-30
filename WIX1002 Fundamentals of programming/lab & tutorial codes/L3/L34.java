package L3;

import java.util.Random;

public class L34 {
    public static void main(String[] args) {
        Random input = new Random();

        int p1 = input.nextInt(7);
        int p2 = input.nextInt(7);
        int p3 = input.nextInt(7);
        int p4 = input.nextInt(7);
        int m1 = p1 + p2;
        int m2 = p3 + p4;

        System.out.println("Player 1 first roll: " + p1);
        System.out.println("Player 1 second roll: " + p2);
        System.out.println("Player 1 total marks: " + m1);

        System.out.println("Player 2 first roll: " + p3);
        System.out.println("Player 2 second roll: " + p4);
        System.out.println("Player 2 total marks: " + m2);

        if (m1 > m2) {
            System.out.print("Player 1 get the highest score! Player 1 won the game!");
        } else {
            System.out.print("Player 2 get the highest score! Player 1 won the game!");
        }
    }
}

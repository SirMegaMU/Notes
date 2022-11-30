package L2;

import java.util.Scanner;

public class L24 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int h, m, s, sec = key.nextInt();
        s = sec;
        h = sec / 3600;
        sec %= 3600;
        m = sec / 60;
        sec %= 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", s, h, m, sec);
    }
}


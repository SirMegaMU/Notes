package L4;

import java.util.Scanner;

public class L42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int num = scan.nextInt();
        int sum = 0;
        for (int x = 1; x <= num; x++) {
            int res = 0;
            for (int y = 1; y <= x; y++) {
                res += y;
            }
            sum += res;
        }
        System.out.print(sum);
    }
}

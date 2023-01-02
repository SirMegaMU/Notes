package L3;

import java.util.Random;

public class L32 {
    public static void main(String[] args) {
        Random random = new Random();
        int num;
        num = random.nextInt(6);
        System.out.println(num);
        switch (num) {
            case (0) -> System.out.println("0 is zero");
            case 1 -> System.out.println("1 is one");
            case 2 -> System.out.println("2 is two");
            case 3 -> System.out.println("3 is three");
            case 4 -> System.out.println("4 is four");
            case 5 -> System.out.println("5 is five");
        }
    }
}


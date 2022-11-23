# 1

~~~java
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
~~~

# 2

~~~java
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
~~~

# 3

~~~java
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
~~~

# 4

~~~java
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
~~~

# 5

~~~java
import java.util.Scanner;

public class L35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Simultaneous linear equations consists of 2 equations, ax + by = e and cx + dy = f");
        System.out.println("For ax + by = e, enter the values for a b e :");

        double a = input.nextDouble(), b = input.nextDouble(), e = input.nextDouble();

        System.out.println("For cx + dy = f, enter the values for c d f :");

        double c = input.nextDouble(),d = input.nextDouble(),f = input.nextDouble();

        if ((a * d) - (b * c) == 0) {
            System.out.println("no solution.");
        } else {
            System.out.println("x = " + (((e * d) - (b * f)) / ((a * d) - (b * c))));
            System.out.println("y = " + (((a * f) - (e * c)) / ((a * d) - (b * c))));
        }
    }
}

~~~

# 6

~~~java
import java.util.Scanner;

public class L36 {
    public static void main(String[] args) {
        double radius, x2, y2, distance, distanceCircle;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        radius = keyboard.nextDouble();
        System.out.print("Enter coordinate point of x: ");
        x2 = keyboard.nextDouble();
        System.out.print("Enter coordinate point of y: ");
        y2 = keyboard.nextDouble();

        distance = ((x2 - 0) * (x2 - 0)) + ((y2 - 0) * (y2 - 0));
        distanceCircle = Math.sqrt(distance);
        if (radius < distanceCircle) {
            System.out.println("The point is outside the circle");
        } else if (radius > distanceCircle) {
            System.out.println("The point is inside the circle");
        } else if (radius == distanceCircle) {
            System.out.println("The point is inside the circle");
        }
    }
}
~~~


# 1

~~~java
public class L6Q1 {

    public static void main(String[] args) {

        L6Q1 calc = new L6Q1();

        for (int i = 1; i <= 20; i++) {
            System.out.println(calc.triangularNumber(i));
        }
    }

    int triangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}
~~~

# 2

~~~java
public class L6Q2 {

    public static void main(String[] args) {

        L6Q2 shape = new L6Q2();

        for (int i = 0; i < 5; i++) {
            shape.multiPrint((i + 1), '*');
        }

        System.out.println("  *  ");
        System.out.println(" *** ");
        shape.multiPrint(5, '*');
        System.out.println(" *** ");
        System.out.println("  *  ");
    }

    void multiPrint(int n, char c) {

        System.out.println(String.valueOf(c).repeat(n));
    }
}
~~~
# 3
~~~java
import java.util.Scanner;

public class L6Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        L6Q3 num = new L6Q3();

        int[] reversed = new int[10];

        System.out.println("Enter 10 integers separated by 1 whitespace:");

        for (int i = 0; i < 10; i++) {
            reversed[i] = num.reverse(sc.nextInt());
        }

        sc.close();
    }

    int reverse(int n) {

        int temp = 0;

        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }

        return temp;
    }
}
~~~

# 4

~~~java
public class L6Q4 {

    public static void main(String[] args) {

        L6Q4 question = new L6Q4();

        System.out.println(question.getGCD(24, 8));
        System.out.println(question.getGCD(200, 625));
    }

    int getGCD(int q, int d) {

        L6Q4 question = new L6Q4();
        int temp = 0;

        if (q < d) {
            temp = q;
            q = d;
            d = temp;
        }

        temp = q % d;
        q = d;
        d = temp;

        if (d == 0) { return q; }

        return question.getGCD(q, d);
    }
}
~~~

# 5

~~~java
import java.util.Scanner;

public class L6Q5 {

    public static void main(String[] args) {

        L6Q5 game = new L6Q5();

        game.start();
    }

    void start() {

        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 0, score = 0, input = 0;

        do {
            System.out.println("Enter negative number to quit:");

            n1 = (int) (Math.random() * 12);
            n2 = (int) (Math.random() * 12);

            System.out.printf("%d × %d = ", n1, n2);

            input = sc.nextInt();

            if (n1 * n2 == input) {
                score++;
            }
        }
        while (input >= 0);

        System.out.printf("Your Score is %d", score);

        sc.close();
    }
}
~~~

# 6

~~~java
public class L6Q6 {

    public static void main(String[] args) {

        L6Q6 numbers = new L6Q6();

        numbers.displayPalindromePrime(20);
        numbers.displayEmirp(20);
    }

    void displayPalindromePrime(int n) {

        int i = 0, thisNumber = 2;

        System.out.println("First 20 Palindrome Primes:");

        while (i < n) {

            if ((((int) Math.log10(thisNumber) + 1) % 2 == 0) && !(((int) Math.log10(thisNumber) + 1) == 2)) {
                thisNumber = (int) Math.pow(10, (int) Math.log10(thisNumber) + 1);
            }

            if ((thisNumber == reverse(thisNumber)) && isPrime(thisNumber)) {
                System.out.printf("%d%s", thisNumber, (i < (n - 1)) ? ", " : "\n");
                i++;
            }

            thisNumber++;
        }
    }

    void displayEmirp(int n) {

        int i = 0, thisNumber = 13;

        System.out.println("First 20 Emirps:");

        while (i < n) {

            if (isPrime(thisNumber) && thisNumber != reverse(thisNumber) && isPrime(reverse(thisNumber))) {
                System.out.printf("%d%s", thisNumber, (i < (n - 1)) ? ", " : "\n");
                i++;
            }

            thisNumber++;
        }
    }

    static int reverse(int n) {

        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    static boolean isPrime(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {

            if (n % i == 0) { return false; }
        }

        return true;
    }
}
~~~


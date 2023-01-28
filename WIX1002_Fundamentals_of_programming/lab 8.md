# 1

~~~java
public class L8Q1 {

    // Global Private Variable
    private final int[] ARR;

    // Constructors
    public L8Q1() {
        ARR = new int[10];
        for (int i = 0; i < 10; i++) { this.ARR[i] = (int) (Math.random() * 100); }
    }

    public L8Q1(int n) {
        ARR = new int[n];
        for (int i = 0; i < n; i++) { this.ARR[i] = (int) (Math.random() * 100); }
    }

    public L8Q1(int n, int ub) {
        ARR = new int[n];
        for (int i = 0; i < n; i++) { this.ARR[i] = (int) (Math.random() * ub); }
    }

    // Methods
    public void displayAll() {
        System.out.println("All Elements in Array:");
        for (int elem: this.ARR) { System.out.printf("%d ", elem); }
        System.out.println();
    }

    public void displayEven() {
        System.out.println("All Even Elements in Array:");
        for (int elem: this.ARR) { if (elem % 2 == 0) { System.out.printf("%d ", elem); } }
        System.out.println();
    }

    public void displayPrime() {
        boolean isPrime = false;
        System.out.println("All Prime Elements in Array:");
        for (int elem: this.ARR) {
            if (elem == 1 || elem == 0) { continue; }
            for (int i = 2; i < Math.sqrt(elem); i++) {
                if (elem % i == 0) { isPrime = false; break; }
                isPrime = true;
            }
            if (isPrime) { System.out.printf("%d ", elem); }
        }
        System.out.println();
    }

    public void displayMax() {
        int max = Integer.MIN_VALUE;
        for (int elem: this.ARR) { max = Math.max(max, elem); }
        System.out.printf("Largest Element in Array: %d\n", max);
    }

    public void displayMin() {
        int min = Integer.MAX_VALUE;
        for (int elem: this.ARR) { min = Math.min(min, elem); }
        System.out.printf("Smallest Element in Array: %d\n", min);
    }

    public void displayAvg() {
        int sum = 0;
        for (int elem: this.ARR) { sum += elem; }
        System.out.printf("Average of Elements in Array: %.2f\n", (sum + 0.0) / this.ARR.length);
    }

    public void displaySqNum() {
        System.out.println("All Elements Squared in Array:");
        for (int elem: this.ARR) { System.out.printf("%d ", elem * elem); }
        System.out.println();
    }
}
~~~

# 2

~~~java
public class L8Q2 {

    private final String NAME;
    private final String IC;
    private final String PASSPORT;
    private double balance;

    // Constructors
    public L8Q2(String name, String ic, String passportNum, double deposit) {
        this.NAME = name;
        this.IC = ic;
        this.PASSPORT = passportNum;
        this.balance = deposit;
        System.out.printf("Savings Account created for %s (IC L8Q1 [%s] and Passport L8Q1 [%s]).\n", this.NAME, this.IC, this.PASSPORT);
        System.out.printf("Currently, there are RM%.2f in your account.\n", this.balance);
    }

    // Methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("The amount exceeds your current savings!");
        }
    }

    public void displayBalance() {
        System.out.printf("Amount in current savings: RM%.2f\n", this.balance);
    }
}
~~~

# 3

~~~java
public class WeightCalculator {

    private final int AGE;
    private final double HEIGHT;

    // Constructor
    public WeightCalculator(int age, double height) {
        this.AGE = age;
        this.HEIGHT = height;
    }

    // Methods
    public double getRecommendedWeight() {
        return ((this.HEIGHT - 100) + ((double) this.AGE / 10)) * 0.9;
    }

    public void displayAge() {
        System.out.printf("Your age is %d.\n", this.AGE);
    }

    public void displayHeight() {
        System.out.printf("Your height is %.2fcm.\n", this.HEIGHT);
    }

    public void displayRecommendedWeight() {
        System.out.printf("Your recommended weight is %.2fkg.\n", getRecommendedWeight());
    }
}
~~~

# 4

~~~java
import java.util.Scanner;

public class Fraction {

    private int numerator;
    private int denominator;

    // Constructor
    public Fraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator (integer): "); this.numerator = sc.nextInt();
        System.out.print("Enter the denominator (integer): "); this.denominator = sc.nextInt();
        sc.close();
    }

    // Methods
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void displayReduced() {
        System.out.printf("The reduced fraction is %d/%d.", (this.numerator / getGCD(this.numerator, this.denominator)), (this.denominator / getGCD(this.numerator, this.denominator)));
    }

    // Class-Specific Method
    private int getGCD(int A, int B) {
        int temp = Math.max(A, B) % Math.min(A, B); A = Math.min(A, B); B = temp;
        if (B == 0) { return A; }
        return getGCD(A, B);
    }
}
~~~

# 5

~~~java
public class Game {

    private final String NAME;
    private int score = 0;

    // Constructor
    public Game(String name) {
        this.NAME = name;
    }

    // Methods
    public void roll() {
        this.score += 1 + (int) (Math.random() * 5);
    }

    public String getName() {
        return this.NAME;
    }

    public int getScore() {
        return this.score;
    }
}
~~~

# 6

~~~java
public class L8Q6 {

    // Variable Belong to Class
    private static int allSales = 0;

    // Variables Belong to Object
    private final String ID;
    private int totalSold;

    // Constructor
    public L8Q6(String ID) {
        this.ID = ID;
        this.totalSold = 0;
    }

    // Methods
    public void salesToday(int count) {
        if (count > 0) {
            this.totalSold += count;
            allSales += count;
        }
    }

    public String getID() {
        return this.ID;
    }

    public int getTotalSold() {
        return this.totalSold;
    }

    public static int getAllTotalSold() {
        return allSales;
    }
}
~~~

# 7

~~~java
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

public class money {

    LinkedHashMap<Integer, Integer> noteSet = new LinkedHashMap<>();
    private int valueCent;

    // Constructor
    public money(double amount) {
        this.valueCent = (int) (amount * 100);
    }

    // Methods
    public void add(@NotNull money m) {
        this.valueCent += m.valueCent;
    }

    public void sub(@NotNull money m) {
        if (this.valueCent > m.valueCent) { this.valueCent -= m.valueCent; }
    }

    public void round() {
        switch (this.valueCent % 10) {
            case 1, 6 -> this.valueCent -= 1;
            case 2, 7 -> this.valueCent -= 2;
            case 3, 8 -> this.valueCent += 2;
            case 4, 9 -> this.valueCent += 1;
            default -> {}
        }
    }

    public void displayValue(String moneyName) {
        System.out.printf("The amount of money for %s is RM%.2f\n", moneyName, this.valueCent / 100.0);
    }

    public void displayNotes(String moneyName) {
        this.calcNotes();
        System.out.printf("For %s:\n", moneyName);
        for (int value: this.noteSet.keySet()) {
            System.out.printf("L8Q1 of %s needed: %d\n", (value / 100 > 0) ? "RM" + value / 100 : value + "cents", this.noteSet.get(value));
        }
    }

    private void calcNotes() {
        int note_100 = this.valueCent / 10000;   this.valueCent %= 10000;    this.noteSet.put(10000, note_100);
        int note_50 = this.valueCent / 5000;     this.valueCent %= 5000;     this.noteSet.put(5000, note_50);
        int note_10 = this.valueCent / 1000;     this.valueCent %= 1000;     this.noteSet.put(1000, note_10);
        int note_5 = this.valueCent / 500;       this.valueCent %= 500;      this.noteSet.put(500, note_5);
        int note_1 = this.valueCent / 100;       this.valueCent %= 100;      this.noteSet.put(100, note_1);
        int coin_50 = this.valueCent / 50;       this.valueCent %= 50;       this.noteSet.put(50, coin_50);
        int coin_20 = this.valueCent / 20;       this.valueCent %= 20;       this.noteSet.put(20, coin_20);
        int coin_10 = this.valueCent / 10;                                   this.noteSet.put(10, coin_10);
        int coin_5 = this.valueCent % 10;                                    this.noteSet.put(5, coin_5);
    }
}
~~~


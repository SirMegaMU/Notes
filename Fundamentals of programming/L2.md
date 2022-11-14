# 1

~~~java
public static void main(String[] args) {
  double cel,fah;
  Scanner key = new Scanner(System.in);
  System.out.print("Please enter the temperature in degree Fahrenheit:");
  fah = key.nextDouble();
  cel = (fah-32)/1.8;
  System.out.printf("The temperature in Celsius is： %.2f",cel);
}
~~~

# 2

~~~java
public static void main(String[] args) {
  double P, D, R, Y, M;
  Scanner key = new Scanner(System.in);
  System.out.print("please enter The price of the car:");
  P = key.nextDouble();
  System.out.print("please enter Down payment:");
  D = key.nextDouble();
  System.out.print("please enter Interest Rate in %:");
  R = key.nextDouble();
  System.out.print("please enter Loan duration in year:");
  Y = key.nextDouble();
  M = (P - D) * (1 - R * Y / 100) / (Y * 12);
  System.out.printf("Monthly Payment:%.2f", M);
}
~~~

# 3

~~~java
public static void main(String[] args) {
        int max_rand = 50, min_rand = 10;
        int rand_inta = (int) Math.floor(Math.random() * (max_rand - min_rand + 1) + min_rand);
        int rand_intb = (int) Math.floor(Math.random() * (max_rand - min_rand + 1) + min_rand);
        int rand_intc = (int) Math.floor(Math.random() * (max_rand - min_rand + 1) + min_rand);
        System.out.printf("%d,%d,%d\n", rand_inta, rand_intb, rand_intc);
        System.out.printf("%.2f", (rand_inta + rand_intb + rand_intc) / (double) 3);

    }
~~~

# 4

~~~java
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
~~~

# 5

~~~java
public static void main(String[] args) {
        int sum = 0, rand_int = (int) Math.floor(Math.random() * (10000 + 1));
        System.out.println(rand_int);
        String[] strs = String.valueOf(rand_int).split("");
        for (String str : strs) {
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
~~~

# 6

~~~java
public static void main(String[] args) {
        float M, Q, final_T, init_T;
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram:");
        M = key.nextFloat() / 1000;
        System.out.print("Enter thr initial temperature in Fahrenheit:");
        init_T = key.nextFloat();
        System.out.print("Enter thr final temperature in Fahrenheit:");
        final_T = key.nextFloat();
        Q = M * (final_T - init_T) * 4184;
        System.out.println("The energy needed is " + Q);
    }
~~~


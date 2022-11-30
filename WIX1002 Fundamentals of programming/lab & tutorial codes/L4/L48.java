package L4;

public class L48 {
    public static void main(String[] args) {
        int n, counter = 0, primeNum = 2;
        n = (int) (Math.random() * 100);

        System.out.println("First " + n + " prime numbers:");

        while (counter < n) {
            boolean isPrime = true;

            for (int i = 2; i < primeNum; i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(primeNum + "\t");
                counter++;
            }
            primeNum++;
        }
    }
}

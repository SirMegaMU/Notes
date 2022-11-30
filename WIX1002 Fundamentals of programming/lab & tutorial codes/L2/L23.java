package L2;

import java.util.Random;

public class L23 {
    public static void main(String[] args) {
        int max_rand = 50, min_rand = 10;
        int rand_inta = (int) Math.floor(Math.random() * (max_rand - min_rand + 1) + min_rand);
        int rand_intb = (int) Math.floor(Math.random() * (max_rand - min_rand + 1) + min_rand);
        int rand_intc = (int) Math.floor(Math.random() * (max_rand - min_rand + 1) + min_rand);
        System.out.printf("%d,%d,%d\n", rand_inta, rand_intb, rand_intc);
        System.out.printf("%.2f", (rand_inta + rand_intb + rand_intc) / (double) 3);

    }
}

package L4;

import java.util.Scanner;

public class L43 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double score = 0,count = 0,total = 0,totalOfSquares = 0;
        double min = 0,max = 0;

        while (score >= 0) {
            System.out.print("Enter a score [negative score to quit]:");
            score = keyboard.nextDouble();

            if (score >= 0) {
                total += score;
                totalOfSquares += (score * score);
                count++;
            }

            if (min == 0 && max == 0) {
                min = score;
                max = score;
            }
            if (score < min && score >= 0)
                min = score;
            if (score > max)
                max = score;
        }

        System.out.println("Total Score: " + total);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);

        double average = total / count;
        System.out.printf("Average Score: %.2f\n", average);

        double sd = Math.sqrt((totalOfSquares - (total * total) / count) / (count - 1));
        System.out.printf("Standard Deviation: %.2f\n", sd);
    }
}

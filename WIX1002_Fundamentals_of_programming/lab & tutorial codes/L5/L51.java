package L5;

import java.util.Scanner;

public class L51 {

    public static void main(String[] args) {
        int N;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the number of students:");
        N = key.nextInt();
        key.close();
        int[] score = new int[N];
        int max = 0, min = 0;
        System.out.println("The scores are:");
        for (int i = 0; i < score.length; i++) {
            score[i] = (int) (Math.random() * 100);
            System.out.print(score[i] + "\t");
            if (i % 10 == 0) {
                System.out.println("");
            }
            if (i == 0) {
                max = score[i];
                min = score[i];
            } else {
                if (score[i] > max) {
                    max = score[i];
                }
                if (score[i] < min) {
                    min = score[i];
                }
            }
        }
        System.out.println("The highest is:" + max + "the lowest is:" + min);
    }
}
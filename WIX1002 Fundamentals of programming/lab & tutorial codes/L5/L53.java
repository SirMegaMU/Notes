package L5;

import java.util.Scanner;

public class L53 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        num.close();
        int[][][] workhours = new int[N][7][2];
        int[] worktotalhours = new int[N];
        for (int i = 0; i < workhours.length; i++) {
            for (int j = 0; j < workhours[i].length; j++) {
                workhours[i][j][0] = (int) (Math.random() * 23);
                workhours[i][j][1] = (int) (Math.random() * (24 - workhours[i][j][0] >= 8 ? 8 : 24 - workhours[i][j][0]) + workhours[i][j][0]);
                worktotalhours[i] += (workhours[i][j][1] - workhours[i][j][0]);
            }
        }
        System.out.println("\tMonday\tTuesday\tWednesday\tThursday\tFriday\tSaturday\tSunday");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%d ~ %d\t", workhours[i][j][0], workhours[i][j][1]);
            }
            System.out.println(worktotalhours[i]);
        }
    }
}
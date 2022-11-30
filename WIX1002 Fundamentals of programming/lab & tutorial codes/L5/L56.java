package L5;

import java.util.Scanner;

public class L56 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate:");
        int rows = key.nextInt();
        key.close();
        System.out.printf("The Pascal Triangle with %d row(s)\n", rows);
        int[][] pascal_triangle = new int[rows][rows];
        pascal_triangle[0][0] = 1;
        for (int i = 0; i < pascal_triangle.length; i++) {
            if (i == 0) {
                print_array(pascal_triangle[i]);
                continue;
            }
            for (int j = 0; j < pascal_triangle[i].length; j++) {
                if (j == 0) {
                    pascal_triangle[i][j] = 1;
                } else if (pascal_triangle[i - 1][j - 1] == 1) {
                    pascal_triangle[i][j] = 1;
                } else {
                    pascal_triangle[i][j] = pascal_triangle[i - 1][j - 1] + pascal_triangle[i - 1][j];
                }
                print_array(pascal_triangle[i]);
            }
        }
    }

    public static void print_array(int[] list) {
        for (int j : list) {
            System.out.print(j + "\t");
        }
        System.out.println(" ");
    }
}

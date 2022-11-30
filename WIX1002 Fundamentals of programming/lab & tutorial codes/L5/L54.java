package L5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class L54 {
    public static void main(String[] args) throws IOException {
        int[][] matrix = new int[3][3];
        String[] tmp;
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < 3; i++) {
            tmp = bi.readLine().split(" ");
            for (int j = 0; j < tmp.length; j++) {
                matrix[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j > 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
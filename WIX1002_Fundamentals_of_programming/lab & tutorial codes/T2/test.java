package T2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int score;
        Scanner key = new Scanner(System.in);
        score = key.nextInt();
        if (score<70){
            System.out.println("F");
        }
        else if(score<75){
            System.out.println("B+");
        }
        else if (score<80){
            System.out.println("A-");
        }
        else if (score >=80) {
            System.out.println("A+");
        }
    }
}

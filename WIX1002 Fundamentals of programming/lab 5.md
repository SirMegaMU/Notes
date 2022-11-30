# 1

~~~java
import java.util.Scanner;

public class L51 {

    public static void main(String[] args) {
        int N;
        Scanner key =  new Scanner(System.in);
        System.out.print("Please enter the number of students:");
        N=key.nextInt();
        key.close();
        int[] score = new int[N];
        int max=0,min=0;
        System.out.println("The scores are:");
        for (int i = 0; i < score.length; i++) {
            score[i]=(int) (Math.random()*100);
            System.out.print(score[i]+"\t");
            if (i % 10 ==0) {
                System.out.println("");
            }
            if (i==0) {
                max=score[i];
                min=score[i];
            } else {
                if (score[i]>max) {
                    max = score[i];
                }
                if (score[i]<min) {
                    min = score[i];
                }
            }
        }System.out.println("The highest is:"+max+"the lowest is:"+min);
    }
}
~~~

# 2

~~~java
public class L52 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = new int[10];
        int i = 0;
        while ( i < nums.length) {
            int temp = (int)(Math.random()*20);
            if (check(temp,nums)) {
                continue;
            }
            i++;
        }
    }

    public static boolean check(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==num) {
                return false;
            }
        }
        return true;
    }
}
~~~

# 3

~~~java
import java.util.Scanner;

public class tmp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int N=num.nextInt();
        num.close();
        int[][][] workhours = new int[N][7][2];
        int[] worktotalhours = new int[N];
        for (int i = 0; i < workhours.length; i++) {
            for (int j = 0; j < workhours[i].length; j++) {
                workhours[i][j][0]=(int)(Math.random()*23); 
                workhours[i][j][1]=(int)(Math.random()*(24- workhours[i][j][0] >=8 ? 8: 24- workhours[i][j][0])+workhours[i][j][0]);
                worktotalhours[i]+=(workhours[i][j][1]-workhours[i][j][0]);
            }
        }
        System.out.println("\tMonday\tTuesday\tWednesday\tThursday\tFriday\tSaturday\tSunday");
        for (int i = 0; i < N; i++) {
            System.out.println();
        }
    }

}
~~~


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
    public static void main(String[] args) {

        int[] nums = new int[10];
        int i = 0;
        while (i < nums.length) {
            int temp = (int) (Math.random() * 20);
            if (check(temp, nums)) {
                continue;
            }
            i++;
        }
    }

    public static boolean check(int num, int[] nums) {
        for (int j : nums) {
            if (j == num) {
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

public class L53 {
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
            for (int j=0; j< 7; j++) {
                System.out.printf("%d ~ %d\t",workhours[i][j][0],workhours[i][j][1]);
            }
            System.out.println(worktotalhours[i]);
        }
    }
}
~~~

# 4

~~~java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class L54 {
    public static void main(String[] args) {
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
~~~

# 5

~~~java
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class L55 {
    public static void main(String[] args) {
        int[] nums = new int[20];
        String[] tmp;
        System.out.println("A list of 20 random integer within 0 to 100");
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        tmp = bi.readLine().split(", ");
        for (int i = 0; i < tmp.length; i++) {
            nums[i] = Integer.parseInt(tmp[i]);
        }
        System.out.println("Array in descending order");
        int[] sorted_nums = bubble_sort(nums);
        for (int sorted_num : sorted_nums) {
            System.out.print(sorted_num + ", ");
        }
        System.out.print("\nEnter a number to search:");
        int target = Integer.parseInt(String.valueOf(bi.read()));
        int[] res1 = linear_search(nums, target);
        int[] res2 = binary_search(nums, target);
        if (res1[0] == 1) {
            System.out.println(target + " found");
            System.out.println("Linear Search - " + res1[1] + " loop(s)");
        } else {
            System.out.println(target + "not found");
        }
        if (res2[0] == 1) {
            System.out.println(target + " found");
            System.out.println("Binary Search - " + res1[1] + " loop(s)");
        } else {
            System.out.println(target + "not found");
        }
    }

    public static int[] bubble_sort(int[] list) {
        for (int i = 0; i < list.length - 2; i++) {
            for (int j = i; j < list.length - 2; j++) {
                if (list[j] < list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

    public static int[] linear_search(int[] list, int target) {
        int[] res = new int[2];
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                res[0] = 1;
                res[1] = i;
                return res;
            }
        }
        res[1] = -1;
        return res;
    }

    public static int[] binary_search(int[] list, int target) {
        int[] sorted_list = bubble_sort(list);
        int[] res = new int[2];
        int i = 0, j = list.length, t = 0;
        while (true) {
            t++;
            if (sorted_list[(i + j) / 2] < target && i != j) {
                j = (i + j) / 2;
            } else if (sorted_list[(i + j) / 2] > target && i != j) {
                i = (i + j) / 2;
            } else if (sorted_list[(i + j) / 2] == target) {
                res[0] = 1;
                res[1] = t;
                return res;
            } else {
                res[1] = -1;
                return res;
            }
        }
    }
}
~~~

# 6

~~~java
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

~~~


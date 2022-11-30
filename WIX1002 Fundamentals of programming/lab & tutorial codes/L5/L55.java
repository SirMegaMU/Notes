package L5;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class L55 {
    public static void main(String[] args) throws IOException {
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
        res[0] = 0;
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
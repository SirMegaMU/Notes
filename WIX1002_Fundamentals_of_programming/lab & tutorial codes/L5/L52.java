package L5;

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
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                return false;
            }
        }
        return true;
    }
}
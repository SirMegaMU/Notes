package T4;

public class T41d {
    public static void main(String[] args) {
    }

    public static int sum(int i) {
        if (i > 1) {
            return i + sum(i - 1);
        }
        else {
            return 1;
        }
    }
}

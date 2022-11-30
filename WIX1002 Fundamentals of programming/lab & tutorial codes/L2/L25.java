package L2;

public class L25 {
    public static void main(String[] args) {
        int sum = 0, rand_int = (int) Math.floor(Math.random() * (10000 + 1));
        System.out.println(rand_int);
        String[] strs = String.valueOf(rand_int).split("");
        for (String str : strs) {
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}

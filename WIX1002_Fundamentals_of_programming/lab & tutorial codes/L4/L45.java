package L4;

import java.util.Random;

public class L45 {
    public static void main(String[] args) {
        int score = 0, dice;
        Boolean status = true;
        while (score < 100) {
            dice = (int) Math.random() * (6) + 1;
            score += dice;
            if (dice == 6) {
                continue;
            } else {
                status  = !status;
            }
        }
        if(status){
            System.out.println("A wins");
        } else {
            System.out.println("B wins");
        }
    }
}

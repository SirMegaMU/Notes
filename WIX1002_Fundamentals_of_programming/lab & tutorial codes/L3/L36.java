package L3;

import java.util.Scanner;

public class L36 {
    public static void main(String[] args) {
        double radius, x2, y2, distance, distanceCircle;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        radius = keyboard.nextDouble();
        System.out.print("Enter coordinate point of x: ");
        x2 = keyboard.nextDouble();
        System.out.print("Enter coordinate point of y: ");
        y2 = keyboard.nextDouble();

        distance = ((x2 - 0) * (x2 - 0)) + ((y2 - 0) * (y2 - 0));
        distanceCircle = Math.sqrt(distance);
        if (radius < distanceCircle) {
            System.out.println("The point is outside the circle");
        } else if (radius > distanceCircle) {
            System.out.println("The point is inside the circle");
        } else if (radius == distanceCircle) {
            System.out.println("The point is inside the circle");
        }
    }
}

import java.util.Scanner;

public class T2 {
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int N=0,c=0;
		for (;;) {
			System.out.print("Enter a number (-1 to quit) :");
			int num1 = key.nextInt();
			if (num1 == -1)break;
			N++;
			System.out.print("Enter a factor : ");
			int num2 = key.nextInt();
			System.out.print(num2+" is a factor of "+num1 +"? (true/false)");
			String ans = key.nextLine();
			if ((num1%num2==0 && ans=="true") || (num1 % num2 !=0 && ans == "false")){
				System.out.println("Your answer is correct.");
				c++;
			} else {
				System.out.println("Your answer is incorrect.");
			}
		}
		System.out.print("The final score is "+c+"/"+N);
	}
}

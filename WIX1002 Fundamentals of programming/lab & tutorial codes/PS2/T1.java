import java.util.Scanner;
import java.util.Random;

public class T1 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter the number of staff:");
		int N = 0;
		int num_staff = key.nextInt();
		key.close();
		for (int i = 0; i<num_staff;i++){
			int ID =(int) (Math.Random()*89999+10000);
			System.out.println("Staff ID: "+ID);
			if(ID / 1000 % 10 % 2==1 && ID / 10 %10 % 2 ==0){
				N++;
				System.out.println("Weekend Duty");
			} else{
				System.out.println("Weekend off");
			}
		}
		System.out.println("The number of staff work during weekend is "+N);
	}
}

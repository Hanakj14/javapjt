package decisionsttmnts;

import java.util.Scanner;

public class NumberOrderCheck {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the first no");
		int num1=scanner.nextInt();
		System.out.println("enter the second no");
		int num2=scanner.nextInt();
		System.out.println("enter the third no");
		int num3=scanner.nextInt();
		if(num1<num2 && num2<num3) {
			System.out.println("increasing");
			
		}
		else if(num1>num2 && num2>num3){
			System.out.println("deacreasing");
		}
		else {
			System.out.println("neither increasing nor decreasing");
		}

	}

}

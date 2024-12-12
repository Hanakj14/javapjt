package work;

import java.util.Scanner;

public class NumberOrderCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.print("enter the first no");
		int num1=sc.nextInt();
		System.out.print("enter the second no");
		int num2=sc.nextInt();
		System.out.print("enter the third no");
		int num3=sc.nextInt();
		
		
		if((num1>num2)&&(num2>num3))
		{
			System.out.print("the nos are decreasing");
		}
		else if((num1<num2)&&(num2<num3))
		{
			System.out.print("the nos are increasing");
		}
		else
		{
			System.out.print("the nos are neither increasing nor decreasing");
		}
	}

}

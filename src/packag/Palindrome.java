package packag;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=a;
		int r=0;
		while(a!=0) {
			int digit = a % 10;
            r = r * 10 + digit;
            a = a/10;
        }
		  if (n == r) {
	            System.out.println(n + " is a palindrome.");
	        } else {
	            System.out.println(n + " is not a palindrome.");
	        }
			
		
			

		  
	}

}

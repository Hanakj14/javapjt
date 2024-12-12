package scnnrprgm;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.print("enter a string"); //hello
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt( i); //o  //ol //oll //olle //olleh
		}
		if(rev.equalsIgnoreCase(s))
		{
		     	
		
		
		System.out.println("is a palindrome");
		}
		else {
		System.out.println("is not a palindrome");
		}
		
		

	}

}

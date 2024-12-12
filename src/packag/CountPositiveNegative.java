package packag;
import java.util.Scanner;


public class CountPositiveNegative {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		int positiveCount = 0;
		int negativeCount = 0;
		System.out.print("enter the nos");
		 int n= scanner.nextInt();
		for(int i=0;i<n;i++) {
		
		num=scanner.nextInt();
		if(num>0) {
			positiveCount++;
			
		}else if(num<0)
		{
			negativeCount++;
		}
		}
		System.out.println("number of positive numbers:"+positiveCount);
		System.out.println("number of negative numbers:"+negativeCount);
		
	}
}
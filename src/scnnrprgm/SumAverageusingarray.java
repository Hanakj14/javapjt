package scnnrprgm;
import java.util.Scanner;

public class SumAverageusingarray {

	public static void main(String[] args) {
		int[] a=new int[4];
		Scanner sc= new Scanner(System.in);
		int sum=0,avg;
		System.out.println("enter the numbers");
		int n=sc.nextInt();
		System.out.println("enter the values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			
		}
		avg=sum/n;
		System.out.println("sum="+sum+"\n"+"average ="+avg);
		
	}

}

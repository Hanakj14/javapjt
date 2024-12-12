package scnnrprgm;
import java.util.Scanner;

public class Usrpassword {

	public static void main(String[] args) {
		System.out.println("enter username and password size:");
		Scanner sc=new Scanner(System.in);
		int rw=sc.nextInt();
		int cl=sc.nextInt();
		System.out.println("enter the values:");
		String[][] arry=new String[rw][cl];
		for(int i=0;i<rw;i++)
		{
			for(int j=0;j<cl;j++)
			{
				arry[i][j]=sc.next();
				
			}
		}
		System.out.println(" the username and corresponding password:");
		for(int i=0;i<rw;i++)
		{
			for(int j=0;j<cl;j++)
			{
				System.out.println(arry[i][j]+"");
				System.out.println();
			}
		}
		
	}

}

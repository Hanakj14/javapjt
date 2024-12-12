package oops;

public class ExceptionNewPg {

	public static void main(String[] args) {
		try
		{
			int c=5/0;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		System.out.println("Hello Hi");
		try
		{
			String s=null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException el)
		{
			System.out.println("Error Message");
		}
		try {
			int[] ar=new int[2];
			ar[0]=1;
			ar[1]=2;
			ar[2]=3;
			
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());
		}
		

	}

}

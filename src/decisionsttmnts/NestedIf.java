package decisionsttmnts;

public class NestedIf {

	public static void main(String[] args) {
		int a=55;
		if(a%5==0)
		{
			if(a%11==0)
			
				System.out.println("a is divisible by 11 and 5");
				
			
			else 
			
				System.out.println("a is divisible by 5 but not 11");
				
			}
		 
		else
			
				System.out.println("a is not  divisible by 5 or 11");
			
			
			
			

	}

}

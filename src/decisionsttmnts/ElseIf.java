package decisionsttmnts;

public class ElseIf {

	public static void main(String[] args) {
		int a=11,b=12,c=13;
		if((a>b)&&(a>c))
		{
			System.out.println("a is greater");
		}
		else if((b>a) && (b>c))
		{
			System.out.println("b is greater");
			
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}

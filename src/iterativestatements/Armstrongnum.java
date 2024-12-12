package iterativestatements;

public class Armstrongnum {

	public static void main(String[] args) {
		int n=153,res=0,r=0,t;
		t=n;
		while(n>0)
		{
			r=n%10;
			res+=(r*r*r);
			n=n/10;
			
		}
		if(t==res)
		System.out.println("armstrong number");
		else
		System.out.println("it is not an armstrong number");
		

	}

}

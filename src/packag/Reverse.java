package packag;

public class Reverse {

	public static void main(String[] args) {
	int a=256;
	int reverse=0;
	
	while(a!=0)
	{
		int num=a%10;
		reverse=reverse*10+num;
		a/=10;
		
	}
	System.out.println("reversed num=" +reverse);

	}

}

import java.util.Scanner;
package packag;

public class Work {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	int positivecount = 0;
	int negativecount = 0;
	System.out.println("enter the nos");
	num = sc.nextInt();
	for(int i=0;i<num;i++) {
		int number=sc.nextInt();
		if(number > 0) {
			positivecount++;
			
		}
		else if(num<0) {
			negativecount++;
			
		}
	}
	System.out.println("number of positive numbers:"+positivecount);
	System.out.println("number of negative numbers:"+negativecount);
	
	
	}

}

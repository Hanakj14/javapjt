package packag;

import java.util.Scanner;

public class Arithmeticoperations {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter your choice ");
		  char n=sc.next().charAt(0);
		  System.out.print("Enter two numbers ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        switch(n) {
	        case '+': System.out.println(a+b );
	                  break;
	                  
	        case '-': System.out.println(a-b);
                      break;
            
            
 	         case '*':  System.out.println(a*b );
                       break;
             
 	        case '/':   System.out.println(a/b );
 	                  break;
 	       default: System.out.println("invalid");
 	       
 	       
            
	        }

	}

}

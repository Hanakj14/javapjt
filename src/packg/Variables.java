package packg;

public class Variables {

	public static void main(String[] args) {
	int num1=23;
	int num2=45;
	if(num1==num2)
	{
		System.out.println("the two numbers are equal");
	}
	else
	{
		System.out.println("the two numbers are not  equal");
	}
		//problem 2
	int a=55,b=70;
	 if (a<50 && a<b) {
         System.out.println("Both conditions are true.");
     } else {
         System.out.println("Both conditions are not true.");
     }
	 //problem 3
	 int c=20,d=30;
	 System.out.println("value of c before swapping  "+c+"\n"+"value of d before swapping "+d);

      
      c = c + d; 
      d = c - d;  
      c = c - d;
      
      
      
      System.out.println("value of c after swapping  "+c+"\n"+"value of d after swapping "+d);

      //problem 4
      
      int z =17;
      int g=z%10;
      
      System.out.println("values of second digit is" +g);

	}

}

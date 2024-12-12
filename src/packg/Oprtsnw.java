package packg;

public class Oprtsnw {

	public static void main(String[] args) {
		//arithmetic operators
		int a=40,b=30;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
      
		//assignment operators
		
	    int c=a;
	    System.out.println((a+=b));//a=a+b 40+30=70
	    System.out.println((a-=b));//a=a-b 70-30=40
	    
	    //relational operators(true/false)
	    System.out.println((a==b));
	    System.out.println((a!=b));
	    System.out.println((a>b)); 
	    System.out.println((a>=b));  
	    System.out.println((a<b));
	    System.out.println((a<=b));
	    
	    //logical operators
	    
	    String username="abc";
	    String password="abc123";
	    System.out.println((username=="abc")&&(password=="abc123"));
	    System.out.println((username=="cde")||(password=="abc124"));
	    System.out.println(!(username=="abc1"));
	    System.out.println(!(password=="abc1"));
	    
	    //unary operators
	    int c1=10,c2=20;
	    // c1++ post-increment
	    // ++c1 pre-increment
	    System.out.println(c1++); //10
	    System.out.println(c1);   //11
	    System.out.println(++c1); //12
	    
	    System.out.println(c1--); //12
	    System.out.println(c1); //11
	    System.out.println(--c1); //10
	    
	    //ternary operator
	    //syntax variable=condition?exp1:exp2
	    String v=c2>c1?"c2 is larger":"c1 is larger";
	    System.out.println(v);
	    
	    
	}

}

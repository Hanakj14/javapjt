package scnnrprgm;

public class StringPgm {

	public static void main(String[] args) {
		//string class
		
		//concat
		String s="Hello";
		String s1="july batch";
		
		System.out.println(s.concat(s1));  //Hello july batch
		System.out.println(s+s1);  //Hellojulybatch
		System.out.println(2+3+s+5+6);  //5Hello56
	
		
		//equals
		
		System.out.println(s.equals(s1)); //false
		//ignorecase
		String s2= "hello";
		System.out.println(s.equalsIgnoreCase(s2)); //true
		System.out.println(s.equals(s2));   //false
		
		//toUpper and toLower
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//length
		
		System.out.println(s1.length());
		
		//startswith  and endswith
		System.out.println(s1.startsWith("july")); //true
		System.out.println(s1.endsWith("batch")); //true
		 
		//contains
		System.out.println(s1.contains("batch")); //true
		
		//trim
		String s3="      Welcome     ";
		String s4=s+s3;
		System.out.println(s4);
		String s5=s3.trim();
		System.out.println(s+s5);
	
		//replace
		String s6="God is Great";
		System.out.println(s6.replace("Great","Love"));
		
		//substring
		System.out.println(s6.substring(7));
		System.out.println(s6.substring(0,3));
		
		//split
		String s7="Hello Luminar Technolab";
		String[] st=s7.split("");
		for(String e:st)
		{
			System.out.println(e);
			
		}
		//tochararray
		String s8="HELLO";
		char[] c=s8.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);
		}
		
		
		
		
	}

}

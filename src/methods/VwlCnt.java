package methods;
import java.util.Scanner;

public class VwlCnt {

	public static void main(String[] args) {
		//vowel count in word
			System.out.println("enter the word");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			VwlCnt v=new VwlCnt();
			int count=v.VwlCnt(s);
			System.out.println("count of vowels in the word="+count);
				
	}
	public int VwlCnt(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{
				
				count++;
			}
		}
		return count;
	}

}

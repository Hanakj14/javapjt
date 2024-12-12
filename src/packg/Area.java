
package packg;
import java.util.Scanner;

public class Area {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Area ob1=new Area();
		System.out.print(“enter the side of the square”);
		Int s=sc.nextInt();
		System.out.print(“ Area of square =”+ob1.squaArea(s));
		System.out.print(“enter the length of the rectangle”);
		Int l=sc.nextInt();
		System.out.print(“enter width of rectangle”);
		Int w=sc.nextInt();
		System.out.print(“area of rectangle”+ob1.rectArea(l,w));
		Ob1.cirArea();
		Ob1.triArea();
		}
		Public int squareArea(int s)
		{ 
		return s*s;
		}
		Public int rectArea(int l,int w);
		return l*w;
		}
		Public void cirArea()
		{
		Scanner sc=new Scanner(System.in);
		System.out.print(“enter the radius of the circle”);
		double r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println(“area of circle=”+area);
		}sc=new Scanner(System.in
		Public void triArea()
		{
		Scanner  sc=new Scanner(System.in);
		System.out.print(“enter the base of the triangle”);
		Double b=sc.nextDouble();
		System.out.print(“enter height of triangle”);
		Double h=sc.nextDouble();
		double area=0.5*b*h;
		System.out.print (“area of triangle=”+area);
		}
		}





}

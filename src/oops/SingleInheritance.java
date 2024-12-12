package oops;

class Car {
	public void displayMthd()
	{
		System.out.println("Cars details");
		
	}

}
class Bmw extends Car{
	public void bmwDetails()
	{
		System.out.println("BMW Car details");
		
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Bmw ob=new Bmw();
		ob.displayMthd();//parent class method
		ob.bmwDetails();//child class method
	}
}

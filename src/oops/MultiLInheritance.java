package oops;
class Birds{
	public void birdsDetails() {
		System.out.println("Birds details");
		
	}
}
class Hen extends Birds{
	public void henMthd() {
		System.out.println("Hen details");
			
	}
}
class Chicken extends Hen{
	public void chickenMthd() {
		System.out.println("Chicken details");
		
	}
}

public class MultiLInheritance {
	public static void main(String[] args) {
		Chicken ob=new Chicken();
		ob.birdsDetails();
		ob.henMthd();
		ob.chickenMthd();
	}

}

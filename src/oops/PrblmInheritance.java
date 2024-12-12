package oops;
class Mmbr{
	String name;
	int age;
	int phonenumber;
	String address;
	int sal;
	public void printMthd() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Contact number:"+phonenumber);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+sal);
	}
}
class Employ extends Mmbr{
	String Department;
}
class Mangr extends Mmbr{
	String Specialisation;
}
public class PrblmInheritance {
	public static void main(String[] args) {
		Employ elnew=new Employ();
		elnew.name="Aradhya";
		elnew.age=23;
		elnew.phonenumber=987654321;
		elnew.address="ernakulam";
		elnew.sal=25000;
		System.out.println(elnew.Department="Testing");
		elnew.printMthd();
	}

}

package oops;
interface CarDetails{
	public void acceleration();
	public void speedLimit();
	public void torque();
	
}
class Benz implements CarDetails{

	@Override
	public void acceleration() {
		System.out.println("Benz Acceleration");
		
		
	}

	@Override
	public void speedLimit() {
		System.out.println("Benz Speed limit");
		
	}

	@Override
	public void torque() {
		System.out.println("Benz torque");
		
		
	}
	
}

public class InterfacePgmNew {
	public static void main(String[] args) {
	Benz ob=new Benz();
	ob.acceleration();
	ob.speedLimit();
	ob.torque();

}}

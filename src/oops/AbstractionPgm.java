package oops;

abstract class Cars{
	abstract public void acceleration();
	
	public void carEngine() {
		System.out.println("Engine details");
		
	}
}
class kia extends Cars{

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");
	}
	
}
public class AbstractionPgm {
	public static void main(String[] args) {
		kia ob=new kia();
		ob.acceleration();
		ob.carEngine();

}
}

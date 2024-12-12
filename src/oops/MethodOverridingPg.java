package oops;
class ParentC{
	public void job() {
		System.out.println("Engineer");
		
	}
	public void phone() {
		System.out.println("samsung");
		
	}
}
class ChildC extends ParentC{

	@Override
	public void job() {
		System.out.println("Doctor");
		
		super.job();
	}

	@Override
	public void phone() {
		System.out.println("nokia");
		
		super.phone();
	}
	
}

public class MethodOverridingPg {
	public static void main(String[] args) {
		ChildC ob=new ChildC();
		ob.job();
		ob.phone();
	}

}

package oops;
class Animal1
{
    public void animalmthd()
    {
    	System.out.println("animal details");
    }
    
    }
class Tiger extends Animal1
{
	public void tigermthd() {
	System.out.println("tiger details");
}

}
class Deer extends Animal1{
	public void deermthd()
	{
		System.out.println("deer details");
	}
		
	}


public class Hierarchial {
	public static void main(String[] args) {
		Tiger t1=new Tiger();
		t1.animalmthd();
		t1.tigermthd();
		Deer d1=new Deer();
		
		d1.animalmthd();
		d1.deermthd();
	}

}

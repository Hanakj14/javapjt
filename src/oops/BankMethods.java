package oops;
import java.util.Scanner;
interface BankM{
	public void accountDetails();
	public void balance();
	public void withdraw();
	public void deposit();
	
}
class Sbi implements BankM{
	int balance=100000;
	static String bankname="SBI";
	int withdraw;
	int deposit;
	int accountNo;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountDetails() {
		System.out.println("enter your account number:");
		accountNo=sc.nextInt();
		System.out.println("your account details :"+"\n"+accountNo+"\n"+bankname);
		
		
		
	}

	@Override
	public void balance() {
		
		System.out.println("your current balance is :" +balance);
				
		
		
	}

	@Override
	public void withdraw() {
		System.out.println("enter amount for withdrawal:");
		withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("your final balance is:"+balance);
		
		
	}

	@Override
	public void deposit() {
		System.out.println("enter deposit amount");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("your final balance is:"+balance);
		
		
		
		
	}
	
}

public class BankMethods {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		ob.accountDetails();
		ob.balance();
		ob.withdraw();
		ob.deposit();
		
		
	}

}

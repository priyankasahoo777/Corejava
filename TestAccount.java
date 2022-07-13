package Ob.op.pr;

public class TestAccount {
public static void main(String[]args) {
	Account a=new Account();
	a.setNumber("76156156464");
	a.setAccountType("saving a/c");
	a.setBalance(7600);
	System.out.println("A/c no.     " +a.getNumber());
	System.out.println("a/c Type    "+a.getAccountType());
	System.out.println(a.getBalance());
	
	
	a.deposite(5000);
	System.out.println("current balance is  "+a.getBalance());
	
	
	a.withdraw(3000);
	System.out.println("After balance is  "+a.getBalance());
	
	a.fundTransfer(3.75);
	System.out.println("fundTransfer    "+a.getBalance());
	

	a.payBill(330);
	System.out.println("PayBill   "+a.getBalance());



}
}

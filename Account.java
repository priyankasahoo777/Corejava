package Ob.op.pr;

public class Account {
   private String number;
   private String accountType;
   private double balance;
   
   public void setNumber(String number) {
	   this.number=number;
}
   public String getNumber () {
	   return number;
   }
  public void setAccountType(String accountType) {
	  this.accountType=accountType;
	  
  }
  public String getAccountType() {
	  return accountType;
  }
  public void setBalance (double balance) {
	  this.balance=balance;
  }
  public double getBalance() {
	  return balance;
  }
    public void deposite (double balance) {
    	double current = balance+getBalance();
    	setBalance(current);
    	
    	
    }
    public void withdraw (double withdraw) {
    	double after =getBalance()-withdraw;
    	setBalance(after);
    }
    
    public void fundTransfer(double fundTransfer) {
    	double after = getBalance()-fundTransfer;
    	setBalance(after);
    }
    public void payBill(double payBill) {
    	double after = getBalance()-payBill;
    	setBalance(after);
    }
}

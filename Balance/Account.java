package com.rays.Balance;

public class Account extends Exception {
 private String name;
 private String accountType;
 private double balance;
 
 public void setName(String name) {
	 this.name=name;
 }
 public String getName() {
	 return name;
 }
 public void setAccount(String accountType) {
	 this .accountType=accountType;
 }
 public String getAccountType() {
	 return accountType;
 }
 public void setBalance(double balance) {
	 this.balance=balance;
 }
 public double getBalance() {
	 return balance;
	 
 } 
 
 public void  deposit(double balance) {
	 double current=balance+getBalance();
	 setBalance(current);
 }
 public void withdraw(double withdraw) {
	 double after=getBalance()-withdraw;
	//setBalance(after);
		try {

	 if (withdraw>getBalance()) {
		
		 throw new Exception();
			
		}else{setBalance(after);}}
			
	 
		catch(Exception e) {
			System.out.println("insufficient fund");
			e.printStackTrace();
			
		}
		}
 }


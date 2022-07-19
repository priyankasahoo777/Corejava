package com.rays.interfac;

public class Businessman implements  RichMan,SocialWorker{
	private double balance;
	public void donation()
	{
		System.out.print("give donation");
		balance=balance-100;
		if(balance>=0)
		{
			System.out.println("you amount is less for donation");
		}
		else
		{
			System.out.println("thank you for donation");
		}
	}
	public void earnMoney()
	{
		System.out.println("earm money");
		balance=balance+500;
		System.out.println(balance);
	}
public void party()

{
	if(balance>1000)
	{
		System.out.println("lets party");
	}
	else
	{
		System.out.println("opppsss i have not money ");
	}
	
}
public void helpToOther() {
	System.out.println("yes i know that");
	
}
public static void main(String[] args) {
	RichMan r=new Businessman();
	r.donation();
	r.party();
	r.earnMoney();
	SocialWorker sw=new Businessman();
	sw.helpToOther();
}

 
}

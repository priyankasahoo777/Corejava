package com.rays.Balance;

public class CustomException extends Exception{
/*int age;
	public void validate( int a)
	{
		this.age=a;
		if(age<18)
		{
			System.out.print("user not validate");
		}
	}*/
	public CustomException()
	{
		
		super("user not found");
	}

}


package com.rays.Balance;

public class Add  extends Exception{
   
	int a;
	int b;
	public void test(int a,int b)
	{
		this.a=a;
		this.b=b;
		try {
		if(a<0)
		{
		throw new Exception;	
		}
	}

}


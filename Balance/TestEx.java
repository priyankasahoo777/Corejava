package com.rays.Balance;

public class TestEx {
	public static void main(String[] args) {
		SelfException s=new SelfException();
		int a=5;
		try {
			throw s;
			
		} catch (Exception e) {
			try {
				if(a<1)
				{
					throw new Exception();
				}
				else {
					throw s;
				}}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
			
			//System.out.println("Exception"+e);
			
		}
	
	
	
	
}

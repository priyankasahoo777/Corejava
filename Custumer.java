package com.rays.Balance;

public class Custumer {
 public static void main(String[] args) throws Exception  {
	int a=90;
	
	
		try {
			if(a<100)
			{
				throw new Exception();
			}
		} 
		 catch (Exception e) {
			 e.printStackTrace();
			System.out.println("i cant buy pizza");
		
		}
		finally {
			System.out.println("i am finally");
	}
}
}


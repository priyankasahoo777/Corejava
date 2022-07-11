package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
public static void main(String[]args) throws ParseException {
	
	String a= args[0];
	String b= args[1];
	
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d=sdf.parse(a);
	Date d1=sdf.parse(b);
	System.out.println(d+" "+d1);
	
}
}

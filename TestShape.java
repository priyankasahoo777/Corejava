package com.rays.absct;

public class TestShape {
	public static void main(String[] args) {
		Shape s=new Ractangle();
	
    
    Ractangle r=(Ractangle)s;
    r.setLength(10);
    r.setWidth(20);
    System.out.println(r.area());
    
    Circle c=new Circle();
    c.setRadius(5);
    System.out.println(c.area());
    
    Triangle t=new Triangle();
    t.setBase(20);
    t.setHight(20);
    System.out.println(t.area());
    }   
}

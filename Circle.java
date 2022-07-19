package com.rays.absct;

public class Circle extends Shape {
      private int radius;
    public static double pi=3.14;
    
    public void setRadius(int radius) {
    	this.radius=radius;
    }
    public int getRadius() {
		return radius;
	}
    public double area() {
    	return pi*radius*radius;
    }
    
    
}

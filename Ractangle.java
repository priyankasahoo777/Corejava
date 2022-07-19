package com.rays.absct;

public class Ractangle extends Shape {
    private int length;
    private int width;
    
   public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

public void  setLength(int length ) {
	   this.length=length;
   }
   public double area() {
   return length*width;
}}

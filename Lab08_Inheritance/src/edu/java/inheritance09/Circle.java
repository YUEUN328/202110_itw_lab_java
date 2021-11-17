package edu.java.inheritance09;

public class Circle extends Shape {
	// field
	private double radius;

	// constructor
	public Circle(double radius) {
		super("원");
		this.radius = radius;
	}

	// 구현 
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
}
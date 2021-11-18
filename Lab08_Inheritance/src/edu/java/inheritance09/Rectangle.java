package edu.java.inheritance09;

public class Rectangle extends Shape {
	// field
	private double width;
	private double height;
	
	// constructor
	public Rectangle(double width, double height) {
		super("직사각형"); // 상위 클래스의 생성자를 "명시적"으로 호출
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
	
}
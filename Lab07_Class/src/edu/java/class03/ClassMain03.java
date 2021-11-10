package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.width);
		System.out.println(r1.height);
		
		Rectangle r2 = new Rectangle(3);
		System.out.println(r2.width);
		System.out.println(r2.height);
		System.out.println(r2.area());
		System.out.println(r2.perimeter());

		Rectangle r3 = new Rectangle(4, 5);
		System.out.println(r3.width);
		System.out.println(r3.height);
		System.out.println(r3.area());
		System.out.println(r3.perimeter());
		
	}

}

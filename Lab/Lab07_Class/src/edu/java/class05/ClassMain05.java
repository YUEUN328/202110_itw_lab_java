package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		Score sc1 = new Score();
		System.out.println(sc1.total());
		System.out.println(sc1.mean());
		
		System.out.println();
		Score sc2 = new Score(10, 10, 10, 10);
		System.out.println(sc2.total());
		System.out.println(sc2.mean());
		
		System.out.println();
		Student stu1 = new Student();
		stu1.info();
		
//		System.out.println();
//		Student stu2 = new Student(202100111, "홍길동", );
//		stu2.info();

	}

}

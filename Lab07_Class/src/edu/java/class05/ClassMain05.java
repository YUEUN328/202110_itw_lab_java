package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서 Score 인스턴스를 생성
		Score score1 = new Score();
		System.out.println("총점: " + score1.getTotal());
		System.out.println("평균: " + score1.getAverage());

		System.out.println();
		
		// 파라미터를 갖는 생성자를 사용해서 Score 인스턴스를 생성
		Score score2 = new Score(100, 50, 55, 98);
		System.out.println("총점: " + score2.getTotal());
		System.out.println("평균: " + score2.getAverage());

		System.out.println();
		// 기본 생성자를 사용해서 Student 인스턴스를 생성
		Student stu1 = new Student();
		stu1.info();

		System.out.println();
		// 파라미터를 갖는 생성자를 사용해서 Student 인스턴스를 생성
//		Score score3 = new Score(20, 20, 20, 20);
		Student stu2 = new Student(1004, "오쌤", score1);
		stu2.info();
	}

}  // end class ClassMain05
package edu.java.class05;

public class Student {
	// field
	int id;  	  // 학번
	String name;  // 이름 
	Score score;  // 학생이 수강 신청한 과목의 점수들을 저장하는 객체
	
	// 생성자 - default, 파라미터 3개
	public Student() {}
	
	public Student(int id, String name, Score score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	// 메서드 - info: 학번, 이름, 과목 점수들, 총점, 평균
	public void info() {
		System.out.println("학번: " + id);
		System.out.println("이름: " + name);
		System.out.println("점수: " + score);
//		System.out.println("총점: " + );
//		System.out.println("평균: " + );
	}
	
}  // end class Student 
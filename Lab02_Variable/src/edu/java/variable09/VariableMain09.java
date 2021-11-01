package edu.java.variable09;

import java.util.Scanner;

public class VariableMain09 {

	public static void main(String[] args) {
		// 간단한 성적 처리 프로그램
		// Java, SQL, JSP 과목의 점수(int)를 Scanner를 사용해서 입력받음
		// 세 과목의 점수를 출력
		// 세 과목의 총점을 출력
		// 세 과목의 평균을 출력 - 소수점이 계산되도록!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Java, SQL, JSP 점수를 순서대로 입력!");
		int javaScore = sc.nextInt();
		int sqlScore = sc.nextInt();
		int jspScore = sc.nextInt();
		int threeScores = javaScore + sqlScore + jspScore;
		
		System.out.println("Java: " + javaScore);
		System.out.println("SQL: " + sqlScore);
		System.out.println("JSP: " + jspScore);
		System.out.println("총점: " + threeScores);
		System.out.println("평균: " + threeScores / 3.0);
		
		sc.close(); 
		System.out.println("프로그램 종료");
	}

}
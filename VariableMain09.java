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
		
		System.out.println("Java 점수를 입력하세요!");
		double javaScores = sc.nextInt();
		double sqlScores = sc.nextInt();
		double jspScores = sc.nextInt();
		System.out.println("Java: " + javaScores + "점");
		System.out.println("SQL: " + sqlScores + "점");
		System.out.println("JSP: " + jspScores + "점");
		
//		System.out.println("SQL 점수를 입력하세요!");
//		double sqlScores = sc.nextInt();
//		System.out.println("SQL: " + sqlScores + "점");
//		
//		System.out.println("JSP 점수를 입력하세요!");
//		double jspScores = sc.nextInt();
//		System.out.println("JSP: " + jspScores + "점");
//		
//		System.out.println("총점: " + (javaScores + sqlScores + jspScores + "점"));
//		System.out.println("평균: " + ((javaScores + sqlScores + jspScores) / 3 + "점"));
//		
//		sc.close(); 
//		System.out.println("프로그램 종료");
	}

}

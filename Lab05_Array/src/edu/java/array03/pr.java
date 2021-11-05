package edu.java.array03;

import java.util.Random;

public class pr {

	public static void main(String[] args) {
		// 1완
		// 2완
		// // char(문자) 26개를 저장할 수 있는 배열 array3을 선언
		// array3에 영문 소문자들을 저장(a, b, c, ..., z)
		// array3의 원소들을 출력
		
		char[] array3 = new char[26];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = (char) ('a' + i);			
		} 
		for (char x : array3) {
			System.out.print(x + " ");
		}
		
		// 07
		// 1 ~ 5 사이의 정수 난수 3개를 저장하는 배열 만들기
		// 3개의 숫자는 모두 달라야 함
		Random rand = new Random();
		
		int[] numbers = new int[3];
		
		
		
		
		
		
	}

}

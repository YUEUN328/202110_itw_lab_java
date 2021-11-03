package edu.java.conditional07;

import java.util.Random;

public class ConditionalMain07 {

	public static void main(String[] args) {
		// 1.
		// 0 이상 10 이하의 정수 난수 2개를 만들어서 변수에 저장
		// 두 숫자의 차이(큰 수 - 작은 수)를 출력	
		Random rand = new Random();
		
		int num1 = rand.nextInt(11);
		int num2 = rand.nextInt(11);
		int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		System.out.println("diff = " + diff);
		
		diff = num1 - num2;
		if (diff > 0) {
			System.out.println("diff = " + diff);
		} else {
			System.out.println("diff = " + (-diff));
		}
		
		// 2.
		// 0 이상 10 미만의 정수 난수 1개를 만들어서 변수에 저장
		// 정수가 짝수인지 홀수인지를 출력
		int num3 = rand.nextInt(10);
		System.out.println("num3 = " + num3);
		if (num3 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		String result = (num3 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
	}

}
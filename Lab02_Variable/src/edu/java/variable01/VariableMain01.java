package edu.java.variable01;

public class VariableMain01 {

	public static void main(String[] args) {
		// variable 사용방법 1: 변수 선언과 초기화(값을 할당)을 한 문장으로.
		// 변수타입 변수이름 = 값;
		int number1 = 20; //변수 number1에 정수 20을 할당(저장)함
		int number2 = 5;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		
		//println() 기능
		System.out.println("number1 = " + number1);
		System.out.println("number1 + number2 = " + number1 + number2 ); // (1)
		System.out.println("number1 + number2 = " + (number1 + number2)); // (2)
		// (1)과 (2) 출력 결과 차이
	}

}

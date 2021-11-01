package edu.java.variable03;

public class VariableMain03 {

	public static void main(String[] args) {
		// 정수 타입: byte(1바이트), shotr(2바이트), int(4바이트), long(8바이트), char(2바이트)
		// 실수 타입: float(4바이트), double(8바이트)
		// 논리 타입: boolean(true 또는 false 만을 저장하는 타입)
		
		byte a = 1;
		System.out.println("a = " + a);
		
		// a = 128;
		// 에러 발생: byte 타입에는 -128 ~ 127 범위의 숫자만 저장할 수 있기 때문
		
		short b = 128;
		System.out.println("b = " + b);
		
		// b = 32768;
		// 에러 발생: short 타입에는 -32768 ~ 32767 범위의 숫자만 저장할 수 있기 때문
		
	}

}

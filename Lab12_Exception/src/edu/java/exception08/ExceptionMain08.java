package edu.java.exception08;

public class ExceptionMain08 {

	public static void main(String[] args) {
		// 예외(Exception)을 던지는(throw) 메서드 사용

		// Calculator 클래스 타입의 인스턴스를 생성
		Calculator calc = new Calculator();
		System.out.println(calc.divide(123, 10));
		// 메서드를 호출하는 곳에서 0으로 나누지 않도록 하거나, 또는 try-catch를 사용해서 예외 처리를 하면 됨
		
		System.out.println();
		System.out.println(calc.divide2(123, 0));
	}

}

class Calculator {
	// 파라미터에서 발생할 수 있는 오류를 처리하지 않는 메서드
	public int divide(int x, int y) {
		return x / y;
	}
	
	// if-else를 사용해서 파라미터에서 발생할 수 있는 오류를 처리하는 메서드
	public int divide2(int x, int y) {
		if (y != 0) {			
			return x / y;
		} else {
			System.out.println("0으로 나눌 수 없음!");
			return 0;
		}
	}
	
	// 예외를 던지를 메서드
	public int divide3(int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception("0으로 나누는 예외");
		}
		
		return x / y;
	}
	
}
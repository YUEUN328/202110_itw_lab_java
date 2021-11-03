package edu.java.loop03;

public class LoopMain03 {

	public static void main(String[] args) {
		// for 반복문을 사용해서 0, 2, 4, 6, 8, 10을 한 줄씩 출력
		for (int i = 0; i < 11; i += 2) {  // n은 0부터 10보다 작거나 같을 때까지 2씩 증가시키면서
			System.out.println(i);		   // n을 출력
		}
		
		System.out.println("-----");
		for (int i = 0; i <= 5; i++) {  // n은 0부터 5보다 작거나 같을 때까지 1씩 증가시키면서
			System.out.println(2 * i);  // 2*n을 출력
		}
		
		System.out.println("-----");
		for (int i = 0; i <=10; i++) {  // n은 0부터 10보다 작거나 같을 때까지 1씩 증가시키면서
			if (i % 2 == 0) {			// n이 짝수이면
				System.out.println(i);  // n을 출력
			}
		}
	}  

}

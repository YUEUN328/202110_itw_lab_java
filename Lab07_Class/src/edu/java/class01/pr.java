package edu.java.class01;

public class pr {

	public static void main(String[] args) {
		// 메서드 작성 연습
				int[] scores = {10, 20, 100, 90, 81};  // 정수 5개를 저장하는 배열
				// 총점
				System.out.println("총점: " + sum(scores));
				
				// 평균 계산하는 메서드 호출, 그 결과 출력
				System.out.println("평균: " + avg(scores));
				
				// 표준편차 계산하는 메서드 호출, 그 결과 출력
				System.out.println("표준편차: " + stdDev(scores));
				
				// 최댓값 찾는 메서드 호출, 그 결과 출력
				
				
				// 최솟값 찾는 메서드 호출, 그 결과 출력
								
	}  // end main
	
	public static int sum(int[] numbers) {
		int sum = 0;
		for (int x : numbers) {
			sum += x;
		}
		return sum;
	}
	
	public static double avg(int[] numbers) {
		double avg = (double)sum(numbers) / numbers.length;
		return avg;
	}
	
	public static double stdDev(int[] numbers) {
		double squaresOfSum = 0;
		for (int x : numbers) {
			squaresOfSum += Math.pow(x - avg(numbers), 2);
		}
		double var = squaresOfSum / numbers.length;
		double std = Math.sqrt(var);
		
		return std;

//		(zabbix + )<PostgreSQL> 꼭 공부해라
// 		리눅스 중요
// 		(요즘은 html5 + UX)		
	}
	
}  // end class

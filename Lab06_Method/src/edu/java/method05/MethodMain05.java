package edu.java.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		// 메서드 작성 연습
		int[] scores = {10, 20, 100, 90, 81};  // 정수 5개를 저장하는 배열
		int total = sum(scores);  // 정수 배열을 sum 메서드의 argument로 전달, 호출
		System.out.println("총점: " + total);

		// 평균 계산하는 메서드 호출, 그 결과 출력
		System.out.println("평균: " + avg(scores));
		
		// 표준편차 계산하는 메서드 호출, 그 결과 출력
		System.out.println("표준편차: " + std(scores));
		
		// 최댓값 계산하는 메서드 호출, 그 결과 출력
		System.out.println("최댓값: " + max(scores));
		
		// 최솟값 계산하는 메서드 호출, 그 결과 출력
		System.out.println("최솟값: " + min(scores));
		
		// 모든 메서드의 파라미터 타입은 int[]
		
	}  // end main()

	/**
	 * 정수들의 배열을 전달받아서, 배열의 모든 원소들의 합을 반환하는 메서드
	 * 
	 * @param numbers 정수(int)들의 배열
	 * @return 배열의 모든 원소들의 합
	 */
	public static int sum(int[] numbers) {
		int total = 0;
		for (int x : numbers) {
			total += x; 
		}
		return total;
	}
	
	/**
	 * 정수들의 배열을 전달받아서, 배열의 모든 원소들의 평균을 반환하는 메서드
	 * 
	 * @param args 정수(int)들의 배열
	 * @return 배열의 모든 원소들의 평균
	 */
	public static double avg(int[] args) {
		int sum = 0;
		for (int x : args) {
			sum += x;
		}
		double avg = (double)sum / args.length; 
		return avg;
	}
	
	/**
	 * 정수들의 배열을 전달받아서, 배열의 모든 원소들의 표준편차를 반환하는 메서드
	 * @param args 정수(int)들의 배열
	 * @return 배열의 모든 원소들의 표준편차
	 */
	public static double std(int[] args) {
		int sum = 0;
		for (int x : args) {
			sum += x;
		}
		double avg = (double)sum / args.length; 
		
		double sumOfSquares = 0;		
		for (int x : args) {			
			sumOfSquares += Math.pow(x - avg, 2); 			
		}
		double var = sumOfSquares / args.length;
		double std = Math.sqrt(var);
		return std;		
	}
	
	/**
	 * 정수들의 배열을 전달받아서, 배열의 모든 원소들의 최댓값을 반환하는 메서드
	 * @param args 정수(int)들의 배열
	 * @return 배열의 모든 원소들의 최댓값
	 */
	public static int max(int[] args) {
		int max = args[0];
		for (int x : args) {
			if (max < x) {
				max = x;
			}
		}
		return max;		
	}
	
	/**
	 * 정수들의 배열을 전달받아서, 배열의 모든 원소들의 최솟값을 반환하는 메서드
	 * @param args 정수(int)들의 배열
	 * @return 배열의 모든 원소들의 최솟값
	 */
	public static int min(int[] args) {
		int min = args[0];
		for (int x : args) {
			if (min > x) {
				min = x;
			}
		}
		return min;
	}
	
}  // end class

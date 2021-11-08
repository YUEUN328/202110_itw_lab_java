package edu.java.array08;

import java.util.Random;

public class ArrayMain08 {

	public static void main(String[] args) {		
		// 성적 처리 프로그램	
		Random rand = new Random();  // 난수를 이용해서 점수를 만들기 위해서
		
		// 0 ~ 100 사이의 난수 10개를 저장할 수 있는 배열 선언
		int[] scores = new int[10];  
		
		int sum = 0;  // 총점 변수를 선언
		double avg;  // 평균
		double dev;  // 편차
		double devSqvSum = 0.0;  // 편차제곱합
		double var;  // 분산
		double std;  // 표준편차
		int max;  // 최댓값
		int min;  // 최솟값
		
		// 배열에 난수 10개를 저장 
		for (int i = 0; i < scores.length; i++) {  
		 	scores[i] = rand.nextInt(101);
		}
		
		// 배열에 저장된 모든 점수를 한 줄에 출력
		System.out.print("scores: ");
		for (int s : scores) {  
			System.out.print(s + " ");
		}		
		System.out.println();
		
		// 총점을 계산하고 출력: sum = 0 + scores[0] + scores[1] + scores[2] + ...
		for (int s : scores) {
			sum += s;
		}
//		for (int i = 0; i < scores.length; i++) {  
//			sum += scores[i];  
//		}
		System.out.println("총점: " + sum);  
		
		// 평균을 계산하고 출력: (double)sum / length
		avg = (double)sum / scores.length;  
		System.out.println("평균: " + avg);  
						
		// 표준편차를 계산하고 출력: Math.sqrt() 메서드를 이용 -> 제곱근(squared root)
		// 표준편차(standard deviation) = sqrt(분산)
		// 분산(deviation) = ( (x_0 -avg)^2 + (x_1 -avg)^2 + ...) / N = 데이터들이 평균에서 떨어져 있는 정도		
		for (int s : scores) {
			dev = s - avg;
			devSqvSum += Math.pow(dev, 2); 
		}
//		for (int i = 0; i < scores.length; i++) {
//			dev = scores[i] - avg;  
//			devSqvSum += Math.pow(dev, 2); 
//		}
		var = devSqvSum / scores.length;  
		std = Math.sqrt(var);  
		System.out.println("표준편차: " + std);
		
		// 최댓값을 찾아서 출력
		max = scores[0];  // 배열의 첫 번째 원소를 최댓값이라고 가정
		for (int i = 1; i < scores.length; i++) {  // 배열의 원소들을 모두 반복하면서  
			if (max < scores[i]) {  // 배열에서 max보다 더 큰 값을 찾으면 
				max = scores[i];  // max를 배열에서 찾은 값으로 바꿈
			}
		}
//		for (int s : scores) {
//			if (max < s) {
//				max = s;
//			}
//		}		
		System.out.println("최댓값: " + max);
		
		// 최솟값을 찾아서 출력
		min = scores[0];  // 최솟값을 배열의 첫 번째 값이라고 가정
		for (int s : scores) {  // 배열의 원소들을 모두 반복하면서
			if (min > s) {  // 배열에서 min보다 더 작은 값을 찾으면 
				min = s;  // 더 작은 값으로 min을 변경
			}
		}
//		for (int i = 1; i < scores.length; i++) {  
//			if (min > scores[i]) {   
//				min = scores[i];  
//			}
//		}
		System.out.println("최솟값: " + min);
				
	}  // end main

}
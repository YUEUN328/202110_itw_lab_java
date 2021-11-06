package edu.java.array08;

import java.util.Random;

public class ArrayMain08 {

	public static void main(String[] args) {
		// 성적 처리 프로그램		
		// 난수를 이용해서 점수를 만듦 
		// 0 ~ 10 사이의 난수 5개를 저장할 수 있는 배열 선언
		// 배열에 난수 5개를 저장 
		// 배열에 저장된 모든 점수를 한 줄에 출력
		// 총점을 계산하고 출력: sum = 0 + scores[0] + scores[1] + scores[2] + ... 
		// 평균을 계산하고 출력: (double)sum / length
		// 표준편차를 계산하고 출력: Math.sqrt() 메서드를 이용 -> 제곱근(squared root)
		// 최댓값을 찾아서 출력
		// 최솟값을 찾아서 출력

		Random rand = new Random(); 
		int[] scores = new int[5];  // 배열 선언
		int sum = 0;  // 총점 변수를 선언
		double avg;  // 평균
		double dev;  // 편차
		double devSqvSum = 0;  // 편차제곱합
		double var;  // 분산
		double std;  // 표준편차
		int max;  // 최댓값
		int min;  // 최솟값
		
		for (int i = 0; i < scores.length; i++) {  // 배열에 난수 저장
		 	scores[i] = rand.nextInt(11);
		}
		
		for (int x :scores) {  // 배열에 저장된 모든 점수를 한 줄에 출력
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < scores.length; i++) {  
			sum += scores[i];  // 총점을 계산
		}
		System.out.println("총점: " + sum);  
		
		avg = (double) sum / scores.length;  // 평균을 계산
		System.out.println("평균: " + avg);  
						
		for (int i = 0; i < scores.length; i++) {
			dev = scores[i] - avg;  // 편차를 계산
			devSqvSum += Math.pow(dev, 2);  // 편차제곱합을 계산
		}		
		var = devSqvSum / scores.length;  // 분산을 계산
		std = Math.sqrt(var);  // 표준편차를 계산
		System.out.println("표준편차: " + std);
		
		max = scores[0];
		for (int i = 0; i < scores.length; i++) {  
			if (max < scores[i]) {  // 만약 최댓값보다 scores[i]가 크면 
				max = scores[i];  // 최댓값은 scores[i]
			}
		}
		System.out.println("최댓값: " + max);
		
		min = scores[0];
		for (int i = 0; i < scores.length; i++) {  
			if (min > scores[i]) {  // 만약 최솟값보다 scores[i]가 작으면 
				min = scores[i];  // 최솟값은 scores[i]
			}
		}
		System.out.println("최솟값: " + min);
				
	}  // end main

}
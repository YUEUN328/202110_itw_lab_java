package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain { 

	public static void main(String[] args) {
		// 가위/바위/보 게임(Rock Paper Scissors)
		
		// 가위=1, 바위=2, 보=3으로 정의
		// 사용자가 가위/바위/보 중에 하나를 선택:
		// 	 Scanner 사용해서 1, 2, 3 중에 하나를 입력받고 저장
		// 컴퓨터가 가위/바위/보 중에 하나를 선택:
		//    Random 사용해서 1, 2, 3 중에 하나를 난수로 만들고 저장
		// 사용자와 컴퓨터 중 누가 이겼는지를 판단하고 그 결과를 출력
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("1, 2, 3 중에 하나를 입력>>>");
		int user = sc.nextInt();
		int computer = rand.nextInt(3) + 1;
		int result = user - computer;
		sc.close();
		System.out.println("user = " + user + ", computer = " + computer);
		
		if (result == 1 || result == -2) {
			System.out.println("사용자가 이겼습니다!");
		} else if (result == 0) {
			System.out.println("비겼습니다!");
		} else {
			System.out.println("컴퓨터가 이겼습니다!");
		}
			
	}

}

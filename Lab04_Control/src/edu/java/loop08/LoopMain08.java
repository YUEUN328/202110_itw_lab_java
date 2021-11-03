package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		/* 구구단을 1단부터 12단까지 출력. 1단은 1x1까지, 2단은 2x2까지, ..., 12단은 12x12까지 출력
		 	break를 사용하는 방법과 break를 사용하지 않는 방법을 생각
			(출력 결과)
			1 x 1 = 1
			----------
			2 x 1 = 2
			2 x 2 = 4
			----------
			3 x 1 = 3
			3 x 2 = 6
			3 x 3 = 9
			----------
			...
		 */
		for (int dan = 1; dan < 13; dan++) {			
			for (int n = 1; n < 13; n++) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				if (dan == n) {
					break;
				}  // end if
			}  // end for(n)
			System.out.println("----------");
		}  // end for(dan)
		
		System.out.println("break를 사용하지 않는 방법");
		for (int dan = 1; dan < 13; dan++) {
			for (int n = 1; n < 13; n++) {
				if (dan >= n) {
					System.out.println(dan + " x " + n + " = " + (dan * n));	
				}  // end if
			}  // end for(n)
			System.out.println("----------");
		}  // end for(dan)

	}  // end main

}

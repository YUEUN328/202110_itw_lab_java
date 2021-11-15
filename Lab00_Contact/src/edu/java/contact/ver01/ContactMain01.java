package edu.java.contact.ver01;

import java.util.Scanner;

import edu.java.contact.model.Contact;

public class ContactMain01 {

	private static Scanner scanner = new Scanner(System.in);
	private static Contact[] contacts = new Contact[5];
	private static int count = 0; // 배열에 현재까지 저장된 연락처 개수

	public static void main(String[] args) {
		while (true) {
			// 메인 메뉴 보여주고 메뉴 선택 입력 받기
			System.out.println("--------------------------------------------------------");
			System.out.println("[1] 전체 검색 [2] 인덱스 검색 [3] 추가 [4] 수정 [0] 종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택>>>");
			int user = scanner.nextInt();
			if (user == 0) {
				break;
			} else if (user == 1) {
				Contact c = new Contact();
				System.out.println(c);
			}
		} // end while

		Contact c = new Contact();
		System.out.println(c);
	} // end main()

}
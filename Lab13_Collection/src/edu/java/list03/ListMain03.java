package edu.java.list03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain03 {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Member 타입을 저장할 수 있는 ArrayList를 생성
		List<Member> list = new ArrayList<>();
		
		// 반복문을 사용해서 
		// 아이디와 비밀번호를 입력받아서 Member 객체를 생성해서
		// ArrayList에 Member 타입 객체 3개를 추가
		for (int i = 0; i < 3; i++) {
			System.out.println("아이디 입력>>");
			String memberId = scanner.nextLine();
			System.out.println("비밀번호 입력>>");
			String memberPassword = scanner.nextLine();
			
			Member member = new Member(memberId, memberPassword);
			list.add(member);
		}
		
		// 리스트의 내용을 출력 - 각각의 회원의 아이디와 비밀번호가 출력될 수 있도록 
		System.out.println(list);
		
		// 인덱스 0 위치의 회원 정보 중에서 비밀번호를 변경하고 리스트 내용 출력 
		// (1) 인덱스 0 위치의 회원 정보를 찾음. (2) 그 회원의 비번을 설정(setter)
		list.get(0).setMemberPassword("abcdabcd");
		System.out.println(list);
		
		// 인덱스 1 위치의 회원 정보를 삭제하고 리스트 내용을 출력 - list.remove(int index)
		list.remove(1);
		System.out.println(list);
		
		// 아이디가 일치하면 같은 회원(Member)로 간주되도록 Member 클래스를 수정 - equals, hashCode
		// 아이디가 일치하는 회원을 리스트에서 삭제하고 리스트 내용을 출력 - list.remove(Object value)
		//ㄴ마지막 2개는 equals, hashCode 추가하면 멤버로 삭제가 가능 
		

	}

}
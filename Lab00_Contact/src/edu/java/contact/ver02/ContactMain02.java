package edu.java.contact.ver02;

import static edu.java.contact.ver02.MainMenu.*;

import java.util.Scanner;

import edu.java.contact.model.Contact;
import edu.java.contact.ver02.ContactDao;
import edu.java.contact.ver02.ContactDaoImpl;

// MVC 아키텍쳐에서 View에 해당하는 클래스. UI를 담당
public class ContactMain02 {

	// field
	private static Scanner scanner = new Scanner(System.in);
	private static ContactDao dao = ContactDaoImpl.getInstance();
	
	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 ***");
		
		boolean run = true;
		while (run) {
			int menu = chooseMenu();
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case SELECT_ALL:
				selectAllContacts();
				break;
			case SELECT_BY_INDEX:
				selectContactByIndex();
				break;
			case INSERT:
				insertConctact();
				break;
			case UPDATE:
				updateContact();
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요...");			
			} // end switch
		} // end while
		
		System.out.println("*** 연락처 프로그램 종료 ***");
	} // end main()

	private static void updateContact() {
		System.out.println();
		System.out.println("----- 연락처 업데이트 -----");
		System.out.println("수정할 인덱스 입력>>>");
		String s = scanner.nextLine();
		int index = Integer.parseInt(s);
		System.out.println("수정할 이름 입력>>>");
		String name = scanner.nextLine();
		System.out.println("수정할 전화번호 입력>>>");
		String phone = scanner.nextLine();
		System.out.println("수정할 이메일 입력>>>");
		String email = scanner.nextLine();
		Contact contact = new Contact(name, phone, email);
		
		int result = dao.update(index, contact);
		if (result == 1) {
			System.out.println("연락처 업데이트 성공!!!");
		} else {
			System.out.println("연락처 업데이트 실패...");
		}	
	}

	private static void selectContactByIndex() {
		System.out.println();
		System.out.println("----- 인덱스 검색 기능 -----");
		System.out.println("검색할 인덱스 입력>>>");
		String s = scanner.nextLine();
		int index = Integer.parseInt(s);
		
		Contact contact = dao.select(index);
		System.out.println(contact);
	}

	private static void selectAllContacts() {
		System.out.println();
		System.out.println("----- 전체 연락처 목록 -----");
		
		Contact[] list = dao.select();
		for (Contact c : list) {
			System.out.println(c);
		}
		System.out.println("----------------------------");		
	}

	private static void insertConctact() {
		System.out.println();
		System.out.println("----- 새 연락처 추가 -----");
		System.out.println("이름 입력>>>");
		String name = scanner.nextLine();
		System.out.println("전화번호 입력>>>");
		String phone = scanner.nextLine();
		System.out.println("이메일 입력>>>");
		String email = scanner.nextLine();	
		Contact contact = new Contact(name, phone, email);
		
		int result = dao.insert(contact);
		if (result == 1) {
			System.out.println("새 연락처 추가 성공!!!");
		} else {
			System.out.println("새 연락처 추가 실패...");
		}
	}

	private static int chooseMenu() {
		showMainMenu();
		String s = scanner.nextLine();
		int menu = Integer.parseInt(s);
		return menu;
	}

	private static void showMainMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("[1] 전체 검색 [2] 인덱스 검색 [3] 추가 [4] 수정 [0] 종료");
		System.out.println("--------------------------------------------------------");
		System.out.println("선택>>>");
	}

} // end class ContactMain02
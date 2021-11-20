package edu.java.contact.ver02;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	// 배열 최대 크기 정의
	private static final int MAX_LENGTH = 3;
	
	// 연락처를 저장하기 위한 배열
	private Contact[] contactList = new Contact[MAX_LENGTH];
	
	// 배열에 저장된 연락처 개수를 저장하기 위한 변수
	private int count = 0;
	
	// singleton 디자인 패턴
	private static ContactDaoImpl instance = null;
	
	private ContactDaoImpl () {}
	
	public static ContactDaoImpl getInstance () {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}
		return instance;
	}
		
	@Override
	public Contact[] select() {
		Contact[] list = new Contact[count];
		for (int i = 0; i < count; i++) {
			list[i] = contactList[i];
		}
		
		return list;
	}

	@Override
	public Contact select(int index) {
		Contact contact = null;
		if (index >= 0 && index < MAX_LENGTH) {
			contact = contactList[index];
		}
		
		return contact;
	}

	@Override
	public int insert(Contact c) {
		int result = 0;
		if (count < MAX_LENGTH) {
			contactList[count] = c;
			count++;
			result = 1;
		}
		
		return result;
	}

	@Override
	public int update(int index, Contact contact) {
		int result = 0;
		if (index >= 0 && index < count) {
			contactList[index] = contact;
			result = 1;
		}
		return result;
	}

}
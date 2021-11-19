package edu.java.contact.ver02;

import edu.java.contact.model.Contact;

// MVC 아키텍쳐에서 Controller 인터페이스
public interface ContactDao {

	Contact[] select();
	
	Contact select(int index);
	
	int insert(Contact c);
	
	int update(int index, Contact contact);
	
//	int update(int index, String name, String phone, String email);
}

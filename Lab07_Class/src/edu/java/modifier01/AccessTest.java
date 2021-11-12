package edu.java.modifier01;

public class AccessTest {
	// field(멤버 변수)
	private int privateField;
	int pakageField;
	protected int protectedField;
	public int publicField;
	
	// method
	public void printAllFields() {
		// 같은 클래스 내부에서는 모든 멤버들을 사용할 수 있다
		System.out.println("private: " + privateField);
		System.out.println("pakage: " + pakageField);
		System.out.println("protected: " + protectedField);
		System.out.println("public: " + publicField);
	}
}

package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account account1 = new Account(123456, 1000.0);
		account1.info();
		
		Account account2 = new Account(123789, 1000.0);
		account2.info();
		
		// account1에 10,000원 입금
		account1.deposit(10_000);
		account1.info();
		
		// account1에 3,000원 출금
		account1.withdraw(3_000);
		account1.info();
		
		System.out.println();
		// account1(보내는 계좌)에서 account2(받는 계좌)으로 5,000원을 이체
		account1.transfer(5_000, account2);
		account1.info();
		account2.info();
	}

}

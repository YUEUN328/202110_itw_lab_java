package edu.java.class01;

// 객체 지향 프로그래밍(OOP: Object-Oriented Programming) 언어: Java, C++, C#, Python, ...
// 클래스(class): 프로그램에서 필요한 데이터(field)와 기능(method)을 묶어서 하나의 "데이터 타입"을 정의한 것
// 데이터 타입 -> 변수 선언, 파라미터 선언, 리턴 타입 선언

public class BasicTv {

	// 데이터(객체의 상태를 저장하기 위한 변수) - field, instance variable(인스턴스 변수)
	// filed가 지역 변수와 다른점: 클래스 내부의 모든 메서드가 사용할 수 있는 변수
	boolean powerOn;  // TV의 현재 전원 상태를 저장하기 위한 필드(true: ON, false: OFF)
	int volume;  // TV의 현재 음량 상태를 저장하기 위한 필드
	int channel;  // TV의 현재 채널 번호를 저장하기 위한 필드
	
	// 기능(객체의 동작) - method
	/**
	 * 필드 volume의 값을 1 증가시키고, 증가된 음량을 화면에 출력
	 */
	public void volumeUp() {
		volume++;  // (지역 변수가 아니라) 필드의 값을 변경
		System.out.println("volume: " + volume);  // 변경된 내용 출력
	}
	
	/**
	 * 필드 volume의 값을 1 감소시키고, 변경된 내용을 출력
	 */
	public void volumeDown() {
		volume--;
		System.out.println("volume: " + volume);		
	}
	
	/**
	 * 필드 channel의 값을 1 증가시키고, 변경된 내용을 출력
	 */
	public void channelUp() {
		channel++;
		System.out.println("channel: " + channel);
	}
	
	/**
	 * 필드 channel의 값을 1 감소시키고, 변경된 내용을 출력
	 */
	public void channelDown() {
		channel--;
		System.out.println("channel: " + channel);
	}
	
	/**
	 * TV가 켜져 있는 상태면 끄고, 꺼져 있는 상태면 켬
	 * powerOn의 값이 true이면 false로 변경, powerOn의 값이 false이면 true로 변경
	 */
	public void powerOnOff() {
		if (powerOn) {  // powerOn의 값이 true이면(TV가 켜져 있으면)
			powerOn = false;	
			System.out.println("TV OFF");
		} else {  // powerOn의 값이 false이면(TV가 꺼져 있으면)
			powerOn = true;
			System.out.println("TV ON");
		}
	}
	
}  // end class

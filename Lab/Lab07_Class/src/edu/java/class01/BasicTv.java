package edu.java.class01;

// 객체 지향 프로그래밍(OOP: Object-Oriented Programming) 언어: Java, C++, C#, Python, ...
// 클래스(class): 프로그램에서 필요한 데이터(field)와 기능(method)을 묶어서 하나의 "데이터 타입"을 정의한 것
// 데이터 타입 -> 변수 선언, 파라미터 선언, 리턴 타입 선언

// 클래스 선언: [수식어] class 클래스이름 { ... }
// 클래스 이름 작성 방법:
// - 영문자, 숫자, _, &를 사용할 수 있음
// - 숫자로 시작할 수 없음
// - camel 표기법 권장. 변수와는 다르게 첫글자부터 대문자로 하는 것을 권장
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
		if (powerOn && volume < 5) {
			volume++;  // (지역 변수가 아니라) 필드의 값을 변경
			System.out.println("volume: " + volume);  // 변경된 내용 출력
		} else if (powerOn && volume == 5) {
			System.out.println("volume: " + volume);
		} else {
			System.out.println("TV OFF");
		}
	}
	
	/**
	 * 필드 volume의 값을 1 감소시키고, 변경된 내용을 출력
	 */
	public void volumeDown() {
		if (powerOn && volume > 0) {
			volume--;
			System.out.println("volume: " + volume);
		} else if (powerOn && volume == 0) {
			System.out.println("volume: " + volume);
		} else {
			System.out.println("TV OFF");
		}				
	}
	
	/**
	 * 필드 channel의 값을 1 증가시키고, 변경된 내용을 출력
	 */
	public void channelUp() {
		if (powerOn && channel < 5) {
			channel++;
			System.out.println("channel: " + channel);
		} else if (powerOn && channel == 5) {
			channel = 0;
			System.out.println("channel: " + channel);
		} else {
			System.out.println("TV OFF");
		}		
	}
	
	/**
	 * 필드 channel의 값을 1 감소시키고, 변경된 내용을 출력
	 */
	public void channelDown() {
		if (powerOn && channel > 0) {
			channel--;
			System.out.println("channel: " + channel);
		} else if (powerOn && channel == 0) {
			channel = 5;
			System.out.println("channel: " + channel);
		} else {
			System.out.println("TV OFF");
		}		
	}
	
	/**
	 * TV가 켜져 있는 상태면 끄고, 꺼져 있는 상태면 켬
	 * powerOn의 값이 true이면 false로 변경, powerOn의 값이 false이면 true로 변경
	 */
	public void powerOnOff() {
		if (powerOn) {  // powerOn의 값이 true이면(TV가 켜져 있으면)
			powerOn = false;  // TV를 끔	
			System.out.println("TV OFF");
		} else {  // powerOn의 값이 false이면(TV가 꺼져 있으면)
			powerOn = true;  // TV를 켬
			System.out.println("TV ON");
		}
	}
	
	public void info() {
		System.out.println("--- TV 정보 ---");
		System.out.println("powerOn: " + powerOn);
		System.out.println("volume: " + volume);
		System.out.println("channel: " + channel);
	}
	
}  // end class BasicTv

// 단축키: Ctrl+Shift+F: 소스 코드 포맷팅(들여쓰기 자동으로 해줌)
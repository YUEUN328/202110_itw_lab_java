package edu.java.inheritance09;

public class InheritanceMain09 {

	public static void main(String[] args) {
		// Shape 타입 2개를 저장할 수 있는 배열을 선언
		Shape[] shape = new Shape[2];
		
		// Rectangle 객체를 생성하고 배열의 첫번째 원소로 저장
		Shape rect = new Rectangle(2, 3);
		shape[0] = rect;
		
		// Circle 객체를 생성하고 배열의 두번째 원소로 저장
		Shape cir = new Circle(4);
		shape[1] = cir;
		
		// 향상된 for 문을 사용해서 배열의 원소들의 draw() 메서드를 호출하고 결과 확인
		for (Shape s : shape) {
			s.draw();
		}

	}

}

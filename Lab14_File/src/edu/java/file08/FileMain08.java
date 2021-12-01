package edu.java.file08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class FileMain08 {
	private static final String FILE_NAME = "data/student_list.dat";

	public static void main(String[] args) {
		Random rand = new Random();

		// 1: ArrayList<Student>를 생성
		// ArrayList에 Student 객체 5개를 추가
		// ArrayList를 파일에 write (Serialize, 직렬화)
		// ObjectOutputStream ==> BufferedOutputStream ==> FileOutputStream ==> 파일
		ArrayList<Student> list = new ArrayList<>();

		Score score1 = new Score(50, 50, 100);
		Student stu1 = new Student(1, "Aaa", score1);
		System.out.println(stu1);
		list.add(stu1);

		Student stu2 = new Student(2, "Bbb", new Score(100, 100, 50));
		System.out.println(stu2);
		list.add(stu2);

		for (int i = 0; i < 3; i++) {
			Score score = new Score(rand.nextInt(101), rand.nextInt(101), rand.nextInt(101));
			Student stu = new Student(rand.nextInt(100), "학생" + i, score);
			System.out.println(stu);
			list.add(stu);
		}

		try (FileOutputStream out = new FileOutputStream(FILE_NAME);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oos = new ObjectOutputStream(bout);) {

			oos.writeObject(list);
			System.out.println("파일 생성 성공!");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2: 1번에서 저장된 파일에서 객체를 read
		// 객체를 ArrayList로 타입 변환
		// ArrayList에 저장된 원소들을 모두 출력
		// ObjectInputStream <== BufferedInputStream <== FileInputStream <== 파일
		try (FileInputStream in = new FileInputStream(FILE_NAME);
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bin);) {

			ArrayList<Student> studentList = (ArrayList<Student>) ois.readObject(); // casting(강제 타입 변환)
			// -> 만약 타입 변환이 실패하면 예외(exception)이 발생하고, catch 구문에서 처리할 수 있음

//			Object obj = ois.readObject();
//			if (obj instanceof ArrayList<?>) {
//				ArrayList<Student> studentList = (ArrayList<Student>) obj;

//			System.out.println(studentList);
			System.out.println();
			for (Student s : studentList) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
package edu.java.file08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileMain08 {

	public static void main(String[] args) {
		// 1: ArrayList<Student>를 생성
		try (FileOutputStream out = new FileOutputStream("data/student_list.dat");
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oos = new ObjectOutputStream(bout);) {

			ArrayList<Student> list = new ArrayList<>();

			// ArrayList에 Student 객체 5개를 추가
			for (int i = 0; i < 5; i++) {
				Student s = new Student((i + 1), "Student_" + (i + 1), new Score());
				list.add(s);
			}

			// ArrayList를 파일에 write (Serialize)
			oos.writeObject(list);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2: 1번에서 저장된 파일에서 객체를 read
		try (FileInputStream in = new FileInputStream("data/student_list.dat");
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bin);) {
			Object obj = ois.readObject();

			// 객체를 ArrayList로 타입 변환
			if (obj instanceof ArrayList<?>) {
				ArrayList<Student> list = (ArrayList<Student>) obj;
				// ArrayList에 저장된 원소들을 모두 출력
				System.out.println(list);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
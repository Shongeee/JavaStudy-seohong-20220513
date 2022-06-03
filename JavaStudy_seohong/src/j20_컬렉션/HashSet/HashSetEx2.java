package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		/*
		 * HashSet<Studnet>
		 * 
		 * 20220001, "김준일", "부산대학교"
		 * 20220002, "김준이", "부경대학교"
		 * 
		 * 20220002의 코드를 가진 학생을 조회
		 * 
		 * 20220001의 코드를 가진 학생을 삭제
		 */
		
		
		HashSet<Student> students = new HashSet<Student>();
		
		students.add(new Student(20220001, "김준일", "부산대학교"));
		students.add(new Student(20220002, "김준일", "부경대학교"));
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220002) {
				System.out.println(student);
			}
		}
		
		iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220001) {
				students.remove(student);
			}
		}
		
		System.out.println(students);
	}

}

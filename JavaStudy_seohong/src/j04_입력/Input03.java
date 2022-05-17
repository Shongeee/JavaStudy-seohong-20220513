package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름: 김준일					문자열  name
		 * 나이: 29						정수	age
		 * 연락처: 010-9988-1916		문자열  phone
		 * 주소: 부산 동래구 사직동		문자열  address
		 * 성별: 남						문자	gender
		 * 
		 * [개인정보 출력]
		 * 이름 => 김준일
		 * 나이 => 29
		 * 연락처 => 010-9988-1916
		 * 주소 => 부산 동래구 사직동
		 * 성별 => 남
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("나이: ");
		age = scanner.nextInt();
		System.out.print("연락처: ");
		phone = scanner.next();
		scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
		
		System.out.println();
		
		System.out.println("[개인정보 출력]");
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
		System.out.println("연락처 => " + phone);
		System.out.println("주소 => " + address);
		System.out.println("성별 => " + gender);
	}

}

package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name = "김준일"; // 문자를 조합해서 만들어진 주소가 존재 (리터럴)
		String name2 = "김준일";
		
		System.out.println(name == name2); // true
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름1: ");
		name = scanner.nextLine(); // 각자 '생성'되서 주소값 다름
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2); // false
		
		name = new String("김준일");  // 각자 '생성'되서 주소값 다름
		name2 = new String("김준일");
		
		System.out.println(name == name2); // false
		
		System.out.println(name.equals(name2)); // true

	}

}

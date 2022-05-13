package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 *
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름: 김서홍
		 * 나이: 24
		 * 연락처: 010-7323-0158
		 * 주소: 경상남도 양산시
		 * 
		 */
		
		char name1 = '김';
		char name2 = '서';
		char name3 = '홍';
		int age = 24;
		String phone = "010-7323-0158";
		String address = "경상남도 양산시";
		
		System.out.print("이름: ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("연락처: ");
		System.out.println(phone);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();
		
		System.out.println("이름: " + name1 + name2 + name3);
		System.out.print("이름: ");
		System.out.println(name1 + name2 + name3); //유니코드 16진수 -> 10진수
		System.out.println("" + name1 + name2 + name3);
		System.out.println();
		
		System.out.println("세수의 합: " + 10 + 20 + 30);
		System.out.println("세수의 합: " + (10 + 20 + 30));
	}

}

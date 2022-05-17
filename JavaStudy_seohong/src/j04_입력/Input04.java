package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String 개요 = null;
		String 감독 = null;
		String 등급 = null;
		String 흥행 = null;
		String 줄거리 = null;
		
		System.out.print("개요: ");
		개요 = scanner.nextLine();
		System.out.print("감독: ");
		감독 = scanner.nextLine();
		System.out.print("등급: ");
		등급 = scanner.nextLine();
		System.out.print("흥행: ");
		흥행 = scanner.nextLine();
		System.out.println("줄거리: ");
		줄거리 = scanner.nextLine();
		
		System.out.println("개요: " + 개요);
		System.out.println("감독: " + 감독);
		System.out.println("등급: " + 등급);
		System.out.println("흥행: " + 흥행);
		System.out.println("줄거리");
		System.out.println(줄거리);
	}

}

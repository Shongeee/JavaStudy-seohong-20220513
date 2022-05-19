package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		
		/*
		 * 반복 횟수를 입력하세요: 5
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 
		 */
		
		int num = 0;
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("반복 횟수를 입력하세요: ");
		num = scanner.nextInt();
		
		while(i < num) {
			System.out.println(i + 1);
			i++;
		}
		
		i = 0;
		
		while(i < num) {
			System.out.println(num - i);
			i++;
		}
		
	}

}

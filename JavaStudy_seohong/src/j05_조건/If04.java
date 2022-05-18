package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.print("x: ");
		x = scanner.nextInt();
		System.out.print("y: ");
		y = scanner.nextInt();
		
		if((x < -1000 || x > 1000 || y < -1000 || y > 1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0)){
			System.out.println("계산 불가");
		}else if(x > 0 && y > 0) {
			System.out.println("제1사분면");
		}else if(x < 0 && y > 0){
			System.out.println("제2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("제3사분면");
		}else if(x >0 && y < 0) {
			System.out.println("제4사분면");
		}else {
			System.out.println("원점");
		}
		
		String result = (x < -1000 || x > 1000 || y < -1000 || y > 1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0) ? "계산 불가"
						: x > 0 && y > 0 ? "제1사분면"
								: x < 0 && y > 0 ? "제2사분면"
										: x < 0 && y < 0 ? "제3사분면"
												: x >0 && y < 0 ? "제4사분면" : "원점";
		System.out.println(result);
	}

}

package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length - 1 != i ? ", " : ""));
		}
		
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if(numbers.length - 1 != i) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		
		int i = 0;
		for(int num : numbers) {
			System.out.print(num + (numbers.length - 1 != i ? ", " : ""));
			i++;
		}
		

	}

}

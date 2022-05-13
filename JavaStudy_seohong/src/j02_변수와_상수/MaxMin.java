package j02_변수와_상수;

public class MaxMin {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER;
		MIN_NUMBER = 10;
		
		final String PATH = "C:\\junil\\junil\\workspace";
		
		final double PI = 3.14;
		
		System.out.println("최대값: " + MAX_NUMBER);
		System.out.println("최소값: "+ MIN_NUMBER);
		
		//클래스는 대문자로 시작 (카멜표기법)
		//변수, 메소드는 소문자로 시작 (카멜표기법)
		//상수는 모두 대문자 (단어와 단어 사이 언더바로 구분)
	}

}

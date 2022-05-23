package j08_클래스;

public class FishBun {
	String material; //재료
	String dough;
	
	FishBun(){ //생성자
		System.out.println("생성자 호출");
		// 생성자는 메모리 주소를 반환
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
}

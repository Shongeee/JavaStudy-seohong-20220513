package j14_추상;

/*
 * abstract(추상)
 * 
 * 추상메소드
 * 1. return type 앞에 abstract 키워드가 붙는다.
 * 2. 추상메소드는 일반클래스 안에 선언할 수 없다.
 * 3. 상속 또는 구현된 클래스에서 무조건 Override(재정의)가 되어야한다.
 * 
 * 추상클래스
 * 1. 클래스 type 앞에 abstract 키워드가 붙는다.
 * 2. 추상클래스는 생성할 수 없다.
 * 3. 추상메소드를 포함할 수 있다. 하지만 추상메소드를 꼭 포함하지는 않아도 된다.
 * 
 */


//추상클래스
public abstract class Factory {
	
	//추상메소드
	public abstract void start();
	
	//일반메소드
	public void stop() {
		System.out.println("공장을 멈춥니다.");
	}
	
	private void test() {
		
	}
	
}

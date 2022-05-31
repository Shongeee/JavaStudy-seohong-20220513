package j17_스태틱.싱글톤;

/*
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야 한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는
 *    getInstance() static 메소드가 존재해야 한다.
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static 변수가 존재해야한다. 
 */

public class Singleton {
	private static Singleton instance = new Singleton();
	private int count;
	
	private Singleton() {
	
	}
	
	public static Singleton getInstance() { //스태틱 메소드 내에서는 일반 변수를 사용할 수 없다. (일반 변수는 생성이 되어야 사용가능, 스태틱 메소드는 생성되지 않아도 사용가능)
		if(instance == null) {
			instance = new Singleton(); 
		}
		return instance;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트 -> " + count);
	}
}

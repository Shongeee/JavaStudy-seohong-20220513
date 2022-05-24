package j09_접근지정자.a;

import j09_접근지정자.b.Test2;

public class TestMain {
	
	/*
	 * public		접근 제한 없음
	 * protected	동일 패키지와 상속 받은 클래스 내부
	 * default		동일 패키지 내에서만
	 * private		동일 클래스 내에서만
	 */

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.aaa = "안녕";
		
		Test2 t2 = new Test2();
		t2.ccc = "";
		

	}

}

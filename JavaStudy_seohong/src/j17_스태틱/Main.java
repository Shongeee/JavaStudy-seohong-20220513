package j17_스태틱;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t.method();
		t2.method();
		t3.method();
		
		
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		st.count = 10;
		st2.count = 20;
		st3.count = 30;
		
		StaticTest.count = 100;
		
		st.staticMethod();
		st2.staticMethod();
		st3.staticMethod();
		
		StaticTest.staticMethod();
		

	}

}

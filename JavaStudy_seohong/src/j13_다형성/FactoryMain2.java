package j13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		
		Factory[] factorys = new Factory[100];
		
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory();
		
		for(int i = 0; i < factorys.length; i++) {
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory(); //삼항연산자, 조건연산자
		}
		
		for(Factory factory : factorys) {
			factory.start();
		}
		
		int i = 0;
		double d = i;
		int ii = (int) d;
		
		System.out.println();
		
		// SmartPhoneFactory -> Factory (업캐스팅 가능)
		// SmartPhoneFactory -> Factory -> SmartPhoneFactory (다운캐스팅 가능 - 원래의 자식클래스로만 가능)
		// SmartPhoneFactory -> Factory -> ComputerFactory (다운캐스팅 불가능)
		// Factory -> SmartPhoneFactory / ComputerFactory (다운캐스팅 불가능)
		// instanceof : 원래의 인스턴스(자식클래스) 확인
		
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
				spf.showSmartPhone();
				
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
			
		}
		
		
	}

}

package j14_추상;

public class SamsungFactory extends Factory {
	
	@Override
	public void start() {
		System.out.println("Samsung 팩토리 가동");
	}
	
	@Override
	public void stop() {
		System.out.println("Samsung 공장을 멈춥니다.");
	}

}

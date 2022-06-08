package j22_람다식;

@FunctionalInterface //람다식 사용 시 작성 -> 람다식은 무조건 하나의 메소드만 있어야 함.
public interface Math<T1, T2> {
	public double calc(T1 value1, T2 value2);
}

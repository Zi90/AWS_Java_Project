package day07;

public class Anonymous01 {
	
	interface Power{
		void turnOn();
		void turnOff();
	}
	
//class TV implements Power{
//
//	@Override
//	public void turnOn() {
//		System.out.println("전원이 켜집니다.");
//		
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("전원이 꺼집니다");
//		
//	}
//	
//}

	public static void main(String[] args) {
		/* 익명 클래스(Anonymous Class) : 내부 클래스의 일종
		 * - 인터페이스를 이용하여 객체를 생성할 때, 클래스는 인터페이스를 구현하여 객체를 생성
		 * 익명 클래스를 사용하는 이유
		 * - 인터페이스의 기능이 적고, 그 객체가 1개만 필요할 경우
		 * 
		 * 메서드로 매개변수의 값이 들어와야 할 때 익명클래스를 사용함
		 */
//		Power t = new TV(); // Power를 구현한 클래스이기 때문에 Up Castion 가능
		Anonymous01 a = new Anonymous01();
//		a.product(t);
		
		a.product(new Power() {

			@Override
			public void turnOn() {
				System.out.println("익명클래스/전원이 켜집니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("익명클래스/전원이 꺼집니다.");
				
			}
			
		});

	}
	
	public void product(Power p) {
		p.turnOn(); // 켜짐
		System.out.println("정상 작동중...");
		p.turnOff(); // 꺼짐
	}

}

class A { // 외부 클래스(outer class)
	
	// 내부 클래스(inner class)
	private class B{
		// 내부 클래스를 사용하는 이유.
		// A 클래스에만 필요한 클래스를 생성하기 위해
	}
}
package Anonymous;

public class Main {

	public static void main(String[] args) {
		// Apple 클래스에 인스턴스를 생성
		Apple apple = new Apple();
		//메소드 호출
		apple.Product();
		
		Apple apple1 = new Apple();
		apple1.Method();
		
		//일반적으로 상속을 받아서 메소드를 재정의해서 사용해야 하는 경우
		//1. 클래스를 상속 받아서 메소드를 재정의
		//2. 인스턴스를 생성해서 메소드를 호출
		
		new AbstractClass() {

			@Override
			public void Product() {
				System.out.printf("Use the 'Anonymous Class' Extends Class\n");
			}
			
		}.Product();
		
		
		//위처럼 변수에 저장하지 않고 바로 메소드를 호출하면, 메소드를 1번 밖에 호출하지 못합니다.
		//변수에 내용을 저장하고 변수를 이용해서 메소드를 호출
		Apple apple2 = new Apple() {
			@Override
			public void Product() {
				System.out.printf("Use the 'Anonymous Class' Extends Class\n");
			}
		};
		
		apple.Product();
		
		//인터페이스를 구현한 anonymous class를 만들어서 해결
		new Chiness() {

			@Override
			public void Method() {
				System.out.printf("Use the 'Anonymous Class' Extends Interface\n");
			
			}
		}.Method();
	}
}

		

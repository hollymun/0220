package Polymorphism;

public class StarCraft {

	public static void main(String[] args) {
		
		Control crtl = new Zerg();
		crtl.attack();
		
		crtl = new Protos();
		crtl.attack();
		
		crtl = new Teran();
		crtl.attack();
		
		//ControlT 클래스는 실제 사용을 위해서 만든 클래스가 아니고, 상속관계를 만들기 위해서 생성한 클래스 입니다.
		//ControlT 클래스는 인스턴스를 생성할 필요가 없습니다.
		//인스턴스를 생성하지 못하도록 할 때는 Class 앞에 abstract를 추가해서 추상 클래스로 만들어 주면 됩니다.
		
		
		
	}

}

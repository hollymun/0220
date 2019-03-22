package jet190220;

public class Main {

	public static void main(String[] args) {
		//앞에 Super는 클래스의 이름이고, 뒤의 new Super()는 생성자를 호출하는 구문입니다.
		//Super 클래스에 생성자가 없거나, 매개변수가 없는 생성자가 있으면 이 구문은 Error가 나지 않습니다.
		//생성자를 만들었는데 매개변수가 없는 생성자를 만들지 않으면 Error 입니다.
		
		Sub a = new Sub();
		
		//하위 클래스 타입의 인스턴스 참조는 형 변환 없이 바로 대입 가능
		Super b = new Sub();
	
		//상위 클래스 타입의 참조를 대입할 때는 강제 형 변환을 수행하여 대입해야 합니다.
		//b = (Sub) new Super();	//Exception 발생
		
		a = (Sub)b;		//Exception 발생하지 않습니다. : 본래 자료형이 Sub
		
		b = new Super();
		b.overrideMethod(); //Super 클래스의 OverrideMethod가 호출됩니다.
		b = new Sub();
		b.overrideMethod(); //Sub 클래스의 OverrideMethod가 호출됩니다.
	
		
	
	}

}

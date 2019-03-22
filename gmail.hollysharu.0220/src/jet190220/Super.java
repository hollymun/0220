package jet190220;
//상위 클래스로 사용할 클래스
public class Super {
	//생성자를 만들지 않아도 아래에 생성자가 있는 것으로 간주합니다.
	//생성자를 직접 만들면 이 생성자는 자동 소멸 됩니다.
	//public Super() { }
	
	public Super() { 
		System.out.printf("매개변수가 없는 상위 클래스의 생성자\n");
	}
	

	
	public Super(int a) {
		System.out.printf("매개변수가 있는 상위 클래스의 생성자\n");
			
	}
	
	public void superMethod() {
		System.out.printf("상위 클래스에만 존재하는 메소드\n");
	}
	
	public void overrideMethod() {
		System.out.printf("상위 클래스에 있는 Override Method\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package Anonymous;

//AbstractClass를 상속 받은 Apple class
public class Apple extends AbstractClass implements Chiness {
	
	//상위 클래스의 메소드를 재정의(Override)
	@Override
	public void Product() {
		System.out.printf("Method Overriding\n");
	}

	@Override
	public void Method() {
		System.out.printf("Interface Method\n");
		
	}

}

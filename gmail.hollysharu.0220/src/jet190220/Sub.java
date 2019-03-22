package jet190220;

public class Sub extends Super {
	
	//상속을 받는 클래스에 묵시적으로 존재하는 내용
	/*
	private Super super;
	
	public Sub() {
		super = new Super(); //이 구문을 super()로 표현합니다.
	}
	*/
	
	//생성자를 직접 만들면 첫번째 줄에 super()가 묵시적으로 삽입합니다.
	//super()를 직접 호출하는 문장을 추가하면 없어집니다.
	//상위 클래스의 생성자 내용을 먼저 수행하고 하위 클래스의 생성자 내용을 수행합니다. 
	
	//상위 클래스의 매개변수가 없는 생성자(default constructor)가 없으면 
	//생성자를 만들어서 super()를 이용해서
	//하위 클래스의 생성자를 직접 호출해야 합니다.
	public Sub() {
		super(1); //상위 클래스의 생성자를 직접 호출
		System.out.printf("하위 클래스의 생성자\n");
	}
	
	public void subMethod() {
		System.out.printf("하위 클래스에만 존재하는 메소드\n");
		
	}
	
	//Overriding Method
	//Overriding Method의 상단에 Overriding Method라는 의미로
	//'@Override' 라는 Annotation을 추가할수 있습니다.
	@Override
	public void overrideMethod() {
		//상위 클래스의 메소드 호출
		super.overrideMethod();		//상위 클래스에 만들어져 있는 메소드 호출
		//Overriding의 근본적인 목적이 '기능확장'이므로 
		//상위 클래스의 메소드를 호출해서 제공되는 기능을 수행하고, 
		//자신의 기능을 추가하는 것이 Overriding 본연의 목적에 맞습니다.
		System.out.printf("하위 클래스에 있는 Override Method\n");
	}
	
	
	
	
	
}

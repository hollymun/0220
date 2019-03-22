package Polymorphism;

//인스턴스를 생성할 수 없도록 abstract 키워드 추가
public abstract class Control {
	//이 Method는 실제 사용하기 위해 만든 Method가 아니고
	//Overriding을 하기 위해 만든 Method 입니다.
	//이 Method는 내용을 가질 필요가 없습니다.
	//이런 Method는 결과형 앞에 abstract를 추가해서 abstract Method로 만들수 있습니다.
	//abstract Method는 abstract class나 interface에만 존재할수 있습니다.
	//이 메소드는 하위 클래스에서 반드시 Overriding 해야 합니다.
	public void attack() {
	}
}



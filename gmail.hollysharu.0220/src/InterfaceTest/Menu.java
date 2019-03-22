package InterfaceTest;

//NewProduct 인터페이스를 구현한 클래스
public class Menu implements NewProduct, Japan{

	@Override
	public void jjajang() {
		System.out.printf("Chines Korean Food\n");
	}
	
	@Override
	public void ramen() {
		System.out.printf("Japanes Food\n");
			
	}
	
	
	
	
	
	
	
}

package Anonymous;

//AbstractClass�� ��� ���� Apple class
public class Apple extends AbstractClass implements Chiness {
	
	//���� Ŭ������ �޼ҵ带 ������(Override)
	@Override
	public void Product() {
		System.out.printf("Method Overriding\n");
	}

	@Override
	public void Method() {
		System.out.printf("Interface Method\n");
		
	}

}

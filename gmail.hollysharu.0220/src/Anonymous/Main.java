package Anonymous;

public class Main {

	public static void main(String[] args) {
		// Apple Ŭ������ �ν��Ͻ��� ����
		Apple apple = new Apple();
		//�޼ҵ� ȣ��
		apple.Product();
		
		Apple apple1 = new Apple();
		apple1.Method();
		
		//�Ϲ������� ����� �޾Ƽ� �޼ҵ带 �������ؼ� ����ؾ� �ϴ� ���
		//1. Ŭ������ ��� �޾Ƽ� �޼ҵ带 ������
		//2. �ν��Ͻ��� �����ؼ� �޼ҵ带 ȣ��
		
		new AbstractClass() {

			@Override
			public void Product() {
				System.out.printf("Use the 'Anonymous Class' Extends Class\n");
			}
			
		}.Product();
		
		
		//��ó�� ������ �������� �ʰ� �ٷ� �޼ҵ带 ȣ���ϸ�, �޼ҵ带 1�� �ۿ� ȣ������ ���մϴ�.
		//������ ������ �����ϰ� ������ �̿��ؼ� �޼ҵ带 ȣ��
		Apple apple2 = new Apple() {
			@Override
			public void Product() {
				System.out.printf("Use the 'Anonymous Class' Extends Class\n");
			}
		};
		
		apple.Product();
		
		//�������̽��� ������ anonymous class�� ���� �ذ�
		new Chiness() {

			@Override
			public void Method() {
				System.out.printf("Use the 'Anonymous Class' Extends Interface\n");
			
			}
		}.Method();
	}
}

		

package jet190220;
//���� Ŭ������ ����� Ŭ����
public class Super {
	//�����ڸ� ������ �ʾƵ� �Ʒ��� �����ڰ� �ִ� ������ �����մϴ�.
	//�����ڸ� ���� ����� �� �����ڴ� �ڵ� �Ҹ� �˴ϴ�.
	//public Super() { }
	
	public Super() { 
		System.out.printf("�Ű������� ���� ���� Ŭ������ ������\n");
	}
	

	
	public Super(int a) {
		System.out.printf("�Ű������� �ִ� ���� Ŭ������ ������\n");
			
	}
	
	public void superMethod() {
		System.out.printf("���� Ŭ�������� �����ϴ� �޼ҵ�\n");
	}
	
	public void overrideMethod() {
		System.out.printf("���� Ŭ������ �ִ� Override Method\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

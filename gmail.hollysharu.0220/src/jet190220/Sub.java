package jet190220;

public class Sub extends Super {
	
	//����� �޴� Ŭ������ ���������� �����ϴ� ����
	/*
	private Super super;
	
	public Sub() {
		super = new Super(); //�� ������ super()�� ǥ���մϴ�.
	}
	*/
	
	//�����ڸ� ���� ����� ù��° �ٿ� super()�� ���������� �����մϴ�.
	//super()�� ���� ȣ���ϴ� ������ �߰��ϸ� �������ϴ�.
	//���� Ŭ������ ������ ������ ���� �����ϰ� ���� Ŭ������ ������ ������ �����մϴ�. 
	
	//���� Ŭ������ �Ű������� ���� ������(default constructor)�� ������ 
	//�����ڸ� ���� super()�� �̿��ؼ�
	//���� Ŭ������ �����ڸ� ���� ȣ���ؾ� �մϴ�.
	public Sub() {
		super(1); //���� Ŭ������ �����ڸ� ���� ȣ��
		System.out.printf("���� Ŭ������ ������\n");
	}
	
	public void subMethod() {
		System.out.printf("���� Ŭ�������� �����ϴ� �޼ҵ�\n");
		
	}
	
	//Overriding Method
	//Overriding Method�� ��ܿ� Overriding Method��� �ǹ̷�
	//'@Override' ��� Annotation�� �߰��Ҽ� �ֽ��ϴ�.
	@Override
	public void overrideMethod() {
		//���� Ŭ������ �޼ҵ� ȣ��
		super.overrideMethod();		//���� Ŭ������ ������� �ִ� �޼ҵ� ȣ��
		//Overriding�� �ٺ����� ������ '���Ȯ��'�̹Ƿ� 
		//���� Ŭ������ �޼ҵ带 ȣ���ؼ� �����Ǵ� ����� �����ϰ�, 
		//�ڽ��� ����� �߰��ϴ� ���� Overriding ������ ������ �½��ϴ�.
		System.out.printf("���� Ŭ������ �ִ� Override Method\n");
	}
	
	
	
	
	
}

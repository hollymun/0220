package jet190220;

public class Main {

	public static void main(String[] args) {
		//�տ� Super�� Ŭ������ �̸��̰�, ���� new Super()�� �����ڸ� ȣ���ϴ� �����Դϴ�.
		//Super Ŭ������ �����ڰ� ���ų�, �Ű������� ���� �����ڰ� ������ �� ������ Error�� ���� �ʽ��ϴ�.
		//�����ڸ� ������µ� �Ű������� ���� �����ڸ� ������ ������ Error �Դϴ�.
		
		Sub a = new Sub();
		
		//���� Ŭ���� Ÿ���� �ν��Ͻ� ������ �� ��ȯ ���� �ٷ� ���� ����
		Super b = new Sub();
	
		//���� Ŭ���� Ÿ���� ������ ������ ���� ���� �� ��ȯ�� �����Ͽ� �����ؾ� �մϴ�.
		//b = (Sub) new Super();	//Exception �߻�
		
		a = (Sub)b;		//Exception �߻����� �ʽ��ϴ�. : ���� �ڷ����� Sub
		
		b = new Super();
		b.overrideMethod(); //Super Ŭ������ OverrideMethod�� ȣ��˴ϴ�.
		b = new Sub();
		b.overrideMethod(); //Sub Ŭ������ OverrideMethod�� ȣ��˴ϴ�.
	
		
	
	}

}

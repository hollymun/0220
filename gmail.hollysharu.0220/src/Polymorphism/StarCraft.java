package Polymorphism;

public class StarCraft {

	public static void main(String[] args) {
		
		Control crtl = new Zerg();
		crtl.attack();
		
		crtl = new Protos();
		crtl.attack();
		
		crtl = new Teran();
		crtl.attack();
		
		//ControlT Ŭ������ ���� ����� ���ؼ� ���� Ŭ������ �ƴϰ�, ��Ӱ��踦 ����� ���ؼ� ������ Ŭ���� �Դϴ�.
		//ControlT Ŭ������ �ν��Ͻ��� ������ �ʿ䰡 �����ϴ�.
		//�ν��Ͻ��� �������� ���ϵ��� �� ���� Class �տ� abstract�� �߰��ؼ� �߻� Ŭ������ ����� �ָ� �˴ϴ�.
		
		
		
	}

}

package InnerClass;

public class OuterClass {
	//���� Ŭ����
	class InnerClass{
		public void InnerMethod() {
			System.out.printf("InnerClass Method\n");
		}
	}
	
	//static ����� ������ �ִ� ��쿡�� static inner class�� �����ؼ� �ϳ��� �����ǵ��� ���־�� �մϴ�.
	static class StaticInnerClass{
		public static int n;
	}
	
	public void method(){
	//�޼ҵ� �ȿ��� ������� ���� Ŭ����
	//Local�� �ڱ� ���� �������� ����Ҽ� �ֽ��ϴ�.
		class LocalInnerClass{
			public void InnerMethod(){
				System.out.println("InnerClass Method\n");
		}
	}
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}

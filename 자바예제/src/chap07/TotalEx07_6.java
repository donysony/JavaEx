package �ڹ�������ch07;
class Outer{
	class Inner{
		int iv =100;
	}
}
public class TotalEx07_6 {

	public static void main(String[] args) {
		//OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� ���� ����Ͻÿ�
		Outer ot = new Outer();
		Outer.Inner inner = ot.new Inner();
		System.out.println(inner.iv);
		
		//����Ŭ����(�ν��Ͻ� Ŭ����)�� �ν��Ͻ��� �����ϱ� ���ؼ��� 
//			���� �ܺ�Ŭ������ �ν��Ͻ� ���� 
//			why? �ν��Ͻ�Ŭ������ �ܺ�Ŭ������ �ν��Ͻ� ����ó�� �ܺ�Ŭ������ �ν��Ͻ��� �����Ǿ�� ��밡�� �ϱ� ����
			
		
		
	}

}

package chap09;

public class TotalEx09_4 {

	//�޼���� : contains
	//��� : ù��° ���ڿ�(src)�� �ι�° ���ڿ�(target)�� ���ԵǾ� �ִ��� Ȯ��
	//		���ԵǾ� ������ true, �׷��� ������ false
	//��ȯŸ�� : boolean 
	//�Ű����� : String src
	//		   String target
	//String Ŭ������ indexOf() ����Ұ�
	public static boolean contains(String src, String target) {
		return src.indexOf(target) != -1;
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
		
		
		
		
	}

}

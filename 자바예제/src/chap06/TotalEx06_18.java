package �ڹ�������;

public class Chap06_18 {
//		�޼���� : isNumber
//		��� : �־��� ���ڿ��� ��� ���ڷθ� �̷���� �ִ��� Ȯ���Ѵ�
//			��� ���ڷθ� �̷���� ������ true��ȯ, �׷��� ������ false��ȯ
//			���� �־��� ���ڿ��� null�̰ų� �� ���ڿ� ""�̶�� false ��ȯ
//		��ȯŸ�� : boolean
//		�Ű����� : String str - �˻��� ���ڿ� 
//		hint-String Ŭ������ charAt(int i) �޼��带 ����ϸ� ���ڿ��� i��° ��ġ�� ���ڸ� ���� �� �ִ�
	
	public static boolean isNumber(String str) {
		if(str==null || str.equals("")) // �Ű������� � ���� �Ѿ���� �𸣱⶧���� ��ȿ��üũ  --> �Ѱܹ��� ���ڿ��� null�̰ų� �� ���ڿ��ϰ��
			return 
					false;
		
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch<'0' || ch>'9') {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		String str="123";
		System.out.println(str + "�� �����Դϱ�? "+ isNumber(str) );
		
		str="1234o";
		System.out.println(str + "�� �����Դϱ�? "+ isNumber(str) );
		
		
		
		
		
		
		
		
	}

}

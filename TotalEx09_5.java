package chap09;

public class TotalEx09_5 {

	//�޼���� : delChar
	//��� : �־��� ���ڿ����� ������ ���ڵ��� �����Ͽ� ��ȯ
	//��ȯŸ�� : String
	//�Ű����� : String src - ��ȯ�� ���ڿ�
	//		   String delCh - ������ ���ڵ�� ������ ���ڿ� 
	// StringBuffer�� StringŬ������ charAt(int i)�� indexOf(int ch)�� ����ض�
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i=0;i<src.length();i++) {
			char ch = src.charAt(i);
			
			//ch�� delCh�� ���Ե����� ������ (indexOf()�� ��ã����) sb�� �߰�
			
			if(delCh.indexOf(ch)==-1) //indexOf(int ch)�� ȣ��  --���ԵǾ����� ���� ���
				sb.append(ch);
		}
		return sb.toString(); // StringBuffer�� ����� ������ String���� ��ȯ
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("(1!2@3^4~5"+"->"+delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4 \t5" + "->"+ delChar("1 2 3 4\t5","\t"));
		
		
	}

}

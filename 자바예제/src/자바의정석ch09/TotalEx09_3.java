package �ڹ�������ch09;

public class TotalEx09_3 {
	//�޼���� :count
	//��� : �־��� ���ڿ� (src)�� ã������ ���ڿ�(target)�� ��� �������� ��� ��ȯ
	//��ȯŸ�� : int
	//�Ű����� : String src
	//		   String target
	public static int count(String src, String target) {
		int count =0;	//ã��Ƚ��
		int pos = 0;	//ã�� ������ ��ġ
		//�亯����
//		(1)�ݺ����� ����ؼ� �Ʒ��� ���� �ݺ�
			while(true) {
//		1. src���� target�� pos�� ��ġ���� ã�´�
				pos = src.indexOf(target,pos);
//		2. ã���� count�� ���� 1 ����, pos�� ���� target.length��ŭ ����
				if(pos != 1) {
					count++;
					pos += target.length();//pos�� ã�� �ܾ� ���ķ� �ű�
				}else {
//		3. indexOf�� ����� -1�̸� �ݺ����� ���������� count��ȯ
					break;
				}
			}
			return count;
	
	}
		
//		hint : StringŬ������ indexOf(String str, int fromIndex)�� ����� ��
		
		
		public static void main(String[] args) {

		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
		}
	

}

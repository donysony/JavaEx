package �ڹ�������ch07;

//	�޼���� : gotoPrevChannel
//	��� : ���� ä���� ���� ä�η� ������
//	��ȯŸ�� : x
//	�Ű����� : x
	

public class TotalEx07_5 {

	//�������� 7-4���� �ۼ��� MyTvŬ������ ���� ä�η� �̵��ϴ� ����� �޼��带 �߰�
	//hint ���� ä���� ���� ������ ��������� ����
	public static void main(String[] args) {
		MyTv t = new MyTv();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		
		
	
	}

}

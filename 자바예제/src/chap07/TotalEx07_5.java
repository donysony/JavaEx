package �ڹ�������ch07;
class MyTv2 extends MyTv{
//	�޼���� : gotoPrevChannel
//	��� : ���� ä���� ���� ä�η� ������
//	��ȯŸ�� : x
//	�Ű����� : x
	
	void gotoPrevChannel(int channel) {
		
	}
	
	
	
}



public class TotalEx07_5 {

	//�������� 7-4���� �ۼ��� MyTvŬ������ ���� ä�η� �̵��ϴ� ����� �޼��带 �߰�
	
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
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

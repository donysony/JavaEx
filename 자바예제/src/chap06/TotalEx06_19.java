package �ڹ�������;
class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
		
	void turnOnOff() {
//		(1) isPowerOn�� ���� true�̸� false��, false�̸� true�� �ٲ۴�
		isPowerOn = !isPowerOn; // isPowerOn�� �ʱ�ȭ �Ǿ����� �ʱ� ������ !isPowerOn�� ���� ���� �ƴ϶� �� ���� ������ ����(isPowerOn)�� �־������
		if(isPowerOn)
			System.out.println("������ �մϴ�");
		else
			System.out.println("������ ���ϴ�");
	}
	void volumeUp() {
//		(2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1����
		if(volume<MAX_VOLUME)
			volume++;
	}
	void volumeDown() {
//		(3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1����
		if(volume>MIN_VOLUME)
			volume--;
	}
	void channelUp() {
//		(4) channel�� ���� 1����
//		���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ�
		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		channel++;
	}
	void channelDown() {
//		(5) channel�� ���� 1����
//		���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ�
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		channel--;
	}
	
	
	
}
public class TotalEx_19 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.turnOnOff();
		t.channel =100;
		t.volume=0;
		System.out.println("CH:"+t.channel + ", VOL :"+t.volume);
		
		t.turnOnOff();
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel + ", VOL :"+t.volume);
		
		t.volume =100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel + ", VOL :"+t.volume);
		
	}

}

package �ڹ�������ch07;

class MyTv{
	//MyTvŬ������ ������� isPowerOn, channel, volume�� Ŭ���� �ܺο��� ������ �� ������ �����ڸ� ���̰�
	//��� �� ����������� ���� ��𼭳� �а� ������ �����ϵ��� getter�� setter�޼��� �߰��Ͻÿ�
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME =100;
	final int MIN_VOLUME =0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL =1;
	
	//���� �ۼ��� setChannel�޼ҵ�	
//	public void setChannel(int channel){
//		if(channel>=1 && channel<=100) {
//			this.channel = channel;
//		}
//		else {
//			if(channel<1)
//				this.channel = MIN_CHANNEL ;
//			else
//				this.channel = MAX_CHANNEL;			
//			
//		}
//	}
	
	//�����ִ� setChannel�޼ҵ带 �����ϰ�
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL||channel<MIN_CHANNEL )
			return;
		this.channel = channel;
	}
	//���� �ۼ��� setVolume�޼ҵ�
//	public void setVolume(int volume) {
//		if(volume<0||volume>100) {
//			if(volume<0)
//				this.volume = MIN_VOLUME;
//			else
//				this.volume = MAX_VOLUME;
//		}
//		else
//			this.volume = volume;
//	}
	
	//�����ִ� setVolume�޼ҵ带 �����ϰ�
	public void setVolume(int volume) {
		if(volume<MIN_VOLUME||volume>MAX_VOLUME)
			return;
		this.volume = volume;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	
	
	void gotoPrevChannel() {
		channel--;
	}
}




public class TotalEx07_4 {

	public static void main(String[] args) {
		
		
		MyTv t = new MyTv();
		t.setChannel(10);
		System.out.println("CH : " +t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : " +t.getVolume());
		
	}

}

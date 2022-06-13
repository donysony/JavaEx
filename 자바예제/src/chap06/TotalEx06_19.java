package 자바의정석;
class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
		
	void turnOnOff() {
//		(1) isPowerOn의 값이 true이면 false로, false이면 true로 바꾼다
		isPowerOn = !isPowerOn; // isPowerOn이 초기화 되어있지 않기 때문에 !isPowerOn만 쓰는 것이 아니라 이 값을 저장할 공간(isPowerOn)에 넣어줘야함
		if(isPowerOn)
			System.out.println("전원을 켭니다");
		else
			System.out.println("전원을 끕니다");
	}
	void volumeUp() {
//		(2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가
		if(volume<MAX_VOLUME)
			volume++;
	}
	void volumeDown() {
//		(3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소
		if(volume>MIN_VOLUME)
			volume--;
	}
	void channelUp() {
//		(4) channel의 값을 1증가
//		만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꿈
		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		channel++;
	}
	void channelDown() {
//		(5) channel의 값을 1감소
//		만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꿈
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

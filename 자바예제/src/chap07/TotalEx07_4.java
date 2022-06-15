package 자바의정석ch07;

class MyTv{
	//MyTv클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
	//대신 이 멤버변수들의 값을 어디서나 읽고 변경이 가능하도록 getter와 setter메서드 추가하시오
	private boolean isPowerOn;
	private int channel;
	private int volume;
	//TotalEx07_5문제로 변수추가
	private int prevChannel; // 이전채널(previous channel)
	
	final int MAX_VOLUME =100;
	final int MIN_VOLUME =0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL =1;
	
	
	
	
	//내가 작성한 setChannel메소드	
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
	
	//위에있는 setChannel메소드를 간략하게
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL||channel<MIN_CHANNEL )
			return;
		prevChannel = this.channel; //현재채널을 이전 채널에 저장
		
		this.channel = channel;
	}
	//내가 작성한 setVolume메소드
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
	
	//위에있는 setVolume메소드를 간략하게
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

	//TotalEx07_5문제로 메서드 추가
	public void gotoPrevChannel() {
		setChannel(prevChannel);//현재 채널을 이전 채널로 변경
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

package 자바의정석ch07;
class MyTv2 extends MyTv{
//	메서드명 : gotoPrevChannel
//	기능 : 현재 채널을 이전 채널로 변경함
//	반환타입 : x
//	매개변수 : x
	
	void gotoPrevChannel(int channel) {
		
	}
	
	
	
}



public class TotalEx07_5 {

	//연습문제 7-4에서 작성한 MyTv클래스에 이전 채널로 이동하는 기능의 메서드를 추가
	
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

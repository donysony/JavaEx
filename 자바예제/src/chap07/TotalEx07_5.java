package 자바의정석ch07;

//	메서드명 : gotoPrevChannel
//	기능 : 현재 채널을 이전 채널로 변경함
//	반환타입 : x
//	매개변수 : x
	

public class TotalEx07_5 {

	//연습문제 7-4에서 작성한 MyTv클래스에 이전 채널로 이동하는 기능의 메서드를 추가
	//hint 이전 채널의 값을 저장할 멤버변수를 정의
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

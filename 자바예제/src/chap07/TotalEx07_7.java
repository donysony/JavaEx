package 자바의정석ch07;
class Outer{
	static class Inner{
		int iv =200;
	}
}
public class TotalEx07_7 {

	public static void main(String[] args) {
		//Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오
		
		Outer ot = new Outer();
		Outer.Inner inner = new Outer.Inner();
		
		//스태틱클래스는 인스턴스 클래스와 달리 외부 클래스의 인스턴스를 생성하지 않고도 사용할 수 있다 
		
	}

}

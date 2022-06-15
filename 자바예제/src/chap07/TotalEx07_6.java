package 자바의정석ch07;
class Outer{
	class Inner{
		int iv =100;
	}
}
public class TotalEx07_6 {

	public static void main(String[] args) {
		//Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오
		Outer ot = new Outer();
		Outer.Inner inner = ot.new Inner();
		System.out.println(inner.iv);
		
		//내부클래스(인스턴스 클래스)의 인스턴스를 생성하기 위해서는 
//			먼저 외부클래스의 인스턴스 생성 
//			why? 인스턴스클래스는 외부클래스의 인스턴스 변수처럼 외부클래스의 인스턴스가 생성되어야 사용가능 하기 때문
			
		
		
	}

}

package 자바의정석ch07;
class Outer1{
	int value = 10;
	
	class Inner1{
		int value =20;
		
		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer1.this.value);
		}
	}
}
public class TotalEx07_8 {

	public static void main(String[] args) {
		//실행결과 30/n 20/n 10/n
		
		Outer1 ot = new Outer1();
		Outer1.Inner1 inner = ot.new Inner1();
		
		
		
		inner.method1();
		
		
		
	}

}

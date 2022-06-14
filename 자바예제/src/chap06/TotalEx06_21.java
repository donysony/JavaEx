package 자바의정석;

public class TotalEx06_21 {
	//메서드명 : abs
//		기능 : 주어진 값의 절대값을 반환
//		반환타입 : int
//		매개변수 : int value
	static int abs(int value) {
//		return Math.abs(value);
		return value>0? value : -value;
	}
	public static void main(String[] args) {
		
		int value = -5;
		System.out.println(value + "의 절대값 :"+abs(value));
		value = 10;
		System.out.println(value + "의 절대값 :"+abs(value));
		
	}

}

package 자바의정석;

public class Chap06_18 {
//		메서드명 : isNumber
//		기능 : 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인한다
//			모두 숫자로만 이루어져 있으면 true반환, 그렇지 않으면 false반환
//			만일 주어진 문자열이 null이거나 빈 문자열 ""이라면 false 반환
//		반환타입 : boolean
//		매개변수 : String str - 검사할 문자열 
//		hint-String 클래스의 charAt(int i) 메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다
	
	public static boolean isNumber(String str) {
		if(str==null || str.equals("")) // 매개변수로 어떤 값이 넘어올지 모르기때문에 유효성체크  --> 넘겨받은 문자열이 null이거나 빈 문자열일경우
			return 
					false;
		
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch<'0' || ch>'9') {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		String str="123";
		System.out.println(str + "는 숫자입니까? "+ isNumber(str) );
		
		str="1234o";
		System.out.println(str + "는 숫자입니까? "+ isNumber(str) );
		
		
		
		
		
		
		
		
	}

}

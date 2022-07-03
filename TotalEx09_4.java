package chap09;

public class TotalEx09_4 {

	//메서드명 : contains
	//기능 : 첫번째 문자열(src)에 두번째 문자열(target)이 포함되어 있는지 확인
	//		포함되어 있으면 true, 그렇지 않으면 false
	//반환타입 : boolean 
	//매개변수 : String src
	//		   String target
	//String 클래스의 indexOf() 사용할것
	public static boolean contains(String src, String target) {
		return src.indexOf(target) != -1;
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
		
		
		
		
	}

}

package 자바의정석ch09;

public class TotalEx09_3 {
	//메서드명 :count
	//기능 : 주어진 문자열 (src)에 찾으려는 문자열(target)이 몇번 나오는지 세어서 반환
	//반환타입 : int
	//매개변수 : String src
	//		   String target
	public static int count(String src, String target) {
		int count =0;	//찾은횟수
		int pos = 0;	//찾기 시작할 위치
		//답변참조
//		(1)반복문을 사용해서 아래의 과정 반복
			while(true) {
//		1. src에서 target을 pos의 위치부터 찾는다
				pos = src.indexOf(target,pos);
//		2. 찾으면 count의 값을 1 증가, pos의 값을 target.length만큼 증가
				if(pos != 1) {
					count++;
					pos += target.length();//pos를 찾은 단어 이후로 옮김
				}else {
//		3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count반환
					break;
				}
			}
			return count;
	
	}
		
//		hint : String클래스의 indexOf(String str, int fromIndex)를 사용할 것
		
		
		public static void main(String[] args) {

		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
		}
	

}

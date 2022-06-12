package chap04;

public class TotalEx_09 {

	public static void main(String[] args) {
		//int 타입의 변수 num이 있을 때, 각자리의 합을 더한 결과를 출력하는 코드를 완성하라
//		만일 변수num의 값이 12345라면, 1+2+3+4+5의 결과인 15를 출력하라
//		문자열로 변환하지 말고 숫자로만 처리하기
		
		int num = 12345;
		int sum=0;
		for(int i=0;i<5;i++) {
			sum += num%10;
			num=num/10; //num/=10;
			
		}
		//while(num>0){
//		sum+=num%10;
//		num/=10;
		
		System.out.println("sum = "+sum);
	}

}

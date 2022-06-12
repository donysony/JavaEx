package chap03;

public class TotalEx_06 {

	public static void main(String[] args) {
//		화씨(Fahrenheit)를 섭씨(ceicius)로 변환하는 코드이다
//		변환공식 : C=5/9 * (F-32)
//		소수점 셋째자리에서 반올림하기
//		Math.round()사용하지 않고 처리하기
		
		
		int fahrenheit =100;
		float celcius = (int)(5f/9 * (fahrenheit-32)*100+0.5)/100f;
		// 5/9를 하면 정수형나눗셈이기 때문에 0이 나온다 때문에 float형으로 계산해주기
		// 소수점 셋째자리에서 반올림 하기 위해선 10의 배수를 곱해 반올림 하기 위한 위치를 땡겨온다
		//정수형 연산은 무조건 버림을 하기 때문에 0.5를 더하여 반올림을 해준다
		//앞선 연산을 int형으로 변환해주면 소수점아래는 버려지고 정수만 남는다
		//이 상태에서 10의 배수만큼 나누어주고 float형도 맞추어주면 끝!
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
		
		
	}

}

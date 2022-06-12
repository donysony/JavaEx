package chap04;

import java.util.Scanner;

public class TotalEx_14 {

	public static void main(String[] args) {
//		int num =0, sum=0;
//		System.out.print("숫자를 입력하세요 (예: 12345)>");
//		Scanner scan = new Scanner(System.in);
//		String tmp = scan.nextLine();//화면을 통해 입력받은 내용 tmp에 저장
//		num = Integer.parseInt(tmp);
//		
//		while(num != 0) { //조건식 num이 0이 되면 while문을 stop
//			
//			//num을 10으로 나눈 나머지를 sum에 더함
//			sum += num%10;  // sum = sum + num % 10 num의 마지막 자리가 남음
//			
//			System.out.printf("sum =%3d num = %d%n", sum, num);
//			
//			num/=10;//num을 10으로 나눈 값을 다시 num에 저장  
//		}
//		System.out.println("각 자리수의 합 : "+sum);
//	
//	
	//사용자로부터 숫자를 입력받고 이 숫자의 각 자리의 합을 구하는 예제
		int num=0, sum=0;
		System.out.print("숫자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			sum += num%10; // 10으로 나눈 나머지는 입력한 숫자의 마지막 숫자
							//각 숫자의 합을 구할 예정이므로
			System.out.printf("sum =%3d, num=%d%n", sum, num);
			num/=10;//num을 10으로 나누어 -> 순차적으로 num의 마지막 숫자부터 하나씩 빠져나감, num이 0이 되면 반복문을 빠져나갈 수 있도록 함  
			
		}
		System.out.println("각 자리수의 합 : "+sum);
	
	}

}

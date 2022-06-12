package chap04;

public class TotalEx_02 {

	public static void main(String[] args) {
		//2.1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		
		int sum=0;
		for(int i=1;i<=20;i++) {
			
			if(i%2==0 || i%3==0 ) {
				continue;
			}
			sum+=i;
			System.out.printf("sum =%3d i=%d%n", sum, i);
		}
			System.out.println("총합 : " + sum);
		
//			책
//			int sum = 0;
//			for(int i=1; i <=20; i++) {
//			if(i%2!=0 && i%3!=0) //i 2 3 sum i가 2 또는 3의 배수가 아닐 때만 sum에 i를 더한다
//			sum +=i;
//			}
//			System.out.println("sum="+sum);
	}

}

package chap04;

public class TotalEx_04 {

	public static void main(String[] args) {
//4. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상이 되는지 구하시오
		
//		1+3+5+7+9+...
//		(-2) + (-4) + (-6) + (-8) +...
//		int Oddsum =0;
//		int Evensum =0;
//		int totalSum;
		
		

		int sum=0; 
		//총합을 저장할 변수
		int num=1; //몇번째 값까지 더해야할지 구할 수
		int Game; //삼항연산자로 값의 홀/짝여부로 부호를 붙임
		
		while(sum<100) { 
			
			Game = num%2==0?num*(-1):num;   // num이 2의 배수이면 num에 -1을 곱하고 아니면 num을 Game에 저장
			sum+=Game;  //num의 증가할 때마다 바뀌는 값을 sum에 합함
			if(sum==100)
				break;
			num++;//num을 증가시킴
			
		}
		System.out.println(num); //문제점 : 마지막 while문을 탈출하기 전 num의 값이 증가됨 --> if 문을 걸어 sum이 100이 됐을때 num을 증가시키지 않음
		System.out.println(sum);
		
//		int sum = 0; //총합을 저장할 변수
//		int s=1;//값의 부호를 바뀌주는데 사용할 변수
//		int num=0;
//		
//		//조건식의 값이 true이므로 무한반복문 된다
//		for(int i=1; true; i++,s=-s) {
//			//매 반복마다 s의 값은 1,-1,1,-1,...
//			sum = s*i; //i와 부호(s)를 곱해 더할 값을 구한다
//			sum+=num;
//			
//			if(sum>=100)//총합이 100보다 같거나 크면 반복문 빠져나감
//				break;
//		}
//		
//		System.out.println("num="+num);
//		System.out.println("sum="+sum);
		
//		int sum = 0;
//		int s=1;
//		int num=0;
//		
//		for(int i=1;i<100;i++,s=-s) {
//			num = i*s;
//			sum+=num;
	}

}

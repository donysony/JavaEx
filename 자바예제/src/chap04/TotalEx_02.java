package chap04;

public class TotalEx_02 {

	public static void main(String[] args) {
		//2.1���� 20������ ���� �� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
		
		int sum=0;
		for(int i=1;i<=20;i++) {
			
			if(i%2==0 || i%3==0 ) {
				continue;
			}
			sum+=i;
			System.out.printf("sum =%3d i=%d%n", sum, i);
		}
			System.out.println("���� : " + sum);
		
//			å
//			int sum = 0;
//			for(int i=1; i <=20; i++) {
//			if(i%2!=0 && i%3!=0) //i 2 3 sum i�� 2 �Ǵ� 3�� ����� �ƴ� ���� sum�� i�� ���Ѵ�
//			sum +=i;
//			}
//			System.out.println("sum="+sum);
	}

}

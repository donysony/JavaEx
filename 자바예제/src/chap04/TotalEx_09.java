package chap04;

public class TotalEx_09 {

	public static void main(String[] args) {
		//int Ÿ���� ���� num�� ���� ��, ���ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�
//		���� ����num�� ���� 12345���, 1+2+3+4+5�� ����� 15�� ����϶�
//		���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ϱ�
		
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

package chap04;

public class TotalEx_04 {

	public static void main(String[] args) {
//4. 1+(-2)+3+(-4)+... , �� ���� ������ ��� ���س����� �� ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�
		
//		1+3+5+7+9+...
//		(-2) + (-4) + (-6) + (-8) +...
//		int Oddsum =0;
//		int Evensum =0;
//		int totalSum;
		
		

		int sum=0; 
		//������ ������ ����
		int num=1; //���° ������ ���ؾ����� ���� ��
		int Game; //���׿����ڷ� ���� Ȧ/¦���η� ��ȣ�� ����
		
		while(sum<100) { 
			
			Game = num%2==0?num*(-1):num;   // num�� 2�� ����̸� num�� -1�� ���ϰ� �ƴϸ� num�� Game�� ����
			sum+=Game;  //num�� ������ ������ �ٲ�� ���� sum�� ����
			if(sum==100)
				break;
			num++;//num�� ������Ŵ
			
		}
		System.out.println(num); //������ : ������ while���� Ż���ϱ� �� num�� ���� ������ --> if ���� �ɾ� sum�� 100�� ������ num�� ������Ű�� ����
		System.out.println(sum);
		
//		int sum = 0; //������ ������ ����
//		int s=1;//���� ��ȣ�� �ٲ��ִµ� ����� ����
//		int num=0;
//		
//		//���ǽ��� ���� true�̹Ƿ� ���ѹݺ��� �ȴ�
//		for(int i=1; true; i++,s=-s) {
//			//�� �ݺ����� s�� ���� 1,-1,1,-1,...
//			sum = s*i; //i�� ��ȣ(s)�� ���� ���� ���� ���Ѵ�
//			sum+=num;
//			
//			if(sum>=100)//������ 100���� ���ų� ũ�� �ݺ��� ��������
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

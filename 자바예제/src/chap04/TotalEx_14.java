package chap04;

import java.util.Scanner;

public class TotalEx_14 {

	public static void main(String[] args) {
//		int num =0, sum=0;
//		System.out.print("���ڸ� �Է��ϼ��� (��: 12345)>");
//		Scanner scan = new Scanner(System.in);
//		String tmp = scan.nextLine();//ȭ���� ���� �Է¹��� ���� tmp�� ����
//		num = Integer.parseInt(tmp);
//		
//		while(num != 0) { //���ǽ� num�� 0�� �Ǹ� while���� stop
//			
//			//num�� 10���� ���� �������� sum�� ����
//			sum += num%10;  // sum = sum + num % 10 num�� ������ �ڸ��� ����
//			
//			System.out.printf("sum =%3d num = %d%n", sum, num);
//			
//			num/=10;//num�� 10���� ���� ���� �ٽ� num�� ����  
//		}
//		System.out.println("�� �ڸ����� �� : "+sum);
//	
//	
	//����ڷκ��� ���ڸ� �Է¹ް� �� ������ �� �ڸ��� ���� ���ϴ� ����
		int num=0, sum=0;
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			sum += num%10; // 10���� ���� �������� �Է��� ������ ������ ����
							//�� ������ ���� ���� �����̹Ƿ�
			System.out.printf("sum =%3d, num=%d%n", sum, num);
			num/=10;//num�� 10���� ������ -> ���������� num�� ������ ���ں��� �ϳ��� ��������, num�� 0�� �Ǹ� �ݺ����� �������� �� �ֵ��� ��  
			
		}
		System.out.println("�� �ڸ����� �� : "+sum);
	
	}

}

package chap04;

import java.util.Scanner;

public class TotalEx_10 {

	public static void main(String[] args) {
//		1�� 100������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ������
//		����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش� ����ڰ� ��ǻ�Ͱ� ������
//		���ڸ� ���߸� ������ ������ ������� ���ڸ� ������� �˷��ش�
		
		//1~100������ ������ ���� ��� answer�� �����Ѵ�
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		while(answer!=input) {
			System.out.print("1~100������ ���ڸ� �Է��Ͻÿ� : ");
			input = scan.nextInt();
			if(answer>input) {
				System.out.println("up");
			}else if(answer<input) {
				System.out.println("down");
			}
			count++;
		}
		System.out.println("�����Դϴ�");
		System.out.println("�� "+count+"�� ���� ������ϴ�");
	}

}

package chap05;

import java.util.Scanner;

public class Total_Ex06 {

	public static void main(String[] args) {
//		�ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� �����̴� �������� ���� �����ϵ��� ������ �� ���� ä��ÿ�.
		
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
			
			for(int j=0; j<question.length;j++) {
				char tmp;
				int num = (int)(Math.random()*question.length);
				tmp = question[i];
				question[i]=question[num];
				question[num]=tmp;
				
			}
			System.out.printf("Q%d. %s �� ������ �Է��ϼ���.>",i+1, new String(question));
			
			String answer = scan.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.printf("�¾ҽ��ϴ� .%n%n"); 

			}
			else
				System.out.printf("Ʋ�Ƚ��ϴ� .%n%n");
			
		
		
		}
		System.out.println("���α׷� ����");
		
		//������ ��
//		1. Ʋ���� ��� �ǹ��� ������ ����
//		2. ���ΰ�ħ �ϰ��� words�� ������� �ϴٺ��� �ܾ��� ������ �ݹ� �ܿ�����
		
		
		
		
		
		
		
		
		
		//words �迭�� �ִ� �ܾ���� ��ġ�� �ٲ۴�

//		String tmp;
//
//		int num = (int)(Math.random()*words.length);
//		for(int i =0; i<words.length;i++) {
//			tmp = words[i];
//			words[i] = words[num];
//			words[num]=tmp;
//			
//			System.out.printf("Q%d. %s �� ������ �Է��ϼ���. >", i+1,words[i]);
//			String input = scan.nextLine();
//			if(input.equals(words[i])) {
//				System.out.println("����");
//			}else
//				System.out.println("��~~~");
//			break;
//		}
//		System.out.println(Arrays.toString(words));
//		
	}

}

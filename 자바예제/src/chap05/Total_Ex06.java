package chap05;

import java.util.Scanner;

public class Total_Ex06 {

	public static void main(String[] args) {
//		단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다 실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오.
		
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환
			
			for(int j=0; j<question.length;j++) {
				char tmp;
				int num = (int)(Math.random()*question.length);
				tmp = question[i];
				question[i]=question[num];
				question[num]=tmp;
				
			}
			System.out.printf("Q%d. %s 의 정답을 입력하세요.>",i+1, new String(question));
			
			String answer = scan.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다 .%n%n"); 

			}
			else
				System.out.printf("틀렸습니다 .%n%n");
			
		
		
		}
		System.out.println("프로그램 종료");
		
		//개선할 점
//		1. 틀렸을 경우 되묻는 과정이 없다
//		2. 새로고침 하고나서 words의 순서대로 하다보니 단어의 순서가 금방 외워진다
		
		
		
		
		
		
		
		
		
		//words 배열에 있는 단어들의 위치를 바꾼다

//		String tmp;
//
//		int num = (int)(Math.random()*words.length);
//		for(int i =0; i<words.length;i++) {
//			tmp = words[i];
//			words[i] = words[num];
//			words[num]=tmp;
//			
//			System.out.printf("Q%d. %s 의 정답을 입력하세요. >", i+1,words[i]);
//			String input = scan.nextLine();
//			if(input.equals(words[i])) {
//				System.out.println("정답");
//			}else
//				System.out.println("땡~~~");
//			break;
//		}
//		System.out.println(Arrays.toString(words));
//		
	}

}

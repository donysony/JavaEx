package chap04;

import java.util.Scanner;

public class TotalEx_10 {

	public static void main(String[] args) {
//		1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다
//		사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다 사용자가 컴퓨터가 생각한
//		숫자를 맞추면 게임이 끝나고 몇번만에 숫자를 맞췄는지 알려준다
		
		//1~100사이의 임의의 값을 얻어 answer에 저장한다
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		while(answer!=input) {
			System.out.print("1~100사이의 숫자를 입력하시오 : ");
			input = scan.nextInt();
			if(answer>input) {
				System.out.println("up");
			}else if(answer<input) {
				System.out.println("down");
			}
			count++;
		}
		System.out.println("정답입니다");
		System.out.println("총 "+count+"번 만에 맞췄습니다");
	}

}

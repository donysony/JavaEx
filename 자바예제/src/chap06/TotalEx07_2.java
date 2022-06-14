package 자바의정석ch07;

public class TotalEx07_2 {

	public static void main(String[] args) {

		//SutdaDeck클래스에 새로운 메서드를 추가하고 테스트하기
//		1.메서드명 : shuffle
//		  기능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다(Math.random()사용)
//		  반환 : x
//		  매개변수 : x
		
//		2.메서드명 : pick
//		  기능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환 
//		  반환 : SutdaCard
//		  매개변수 : int index - 위치
		
//		3.메서드명 : pick
//		  기능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환 (Math.random()사용)
//		  반환 : SutdaCard
//		  매개변수 : x
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
		System.out.println();
		System.out.println(deck.pick(0));
		
	}

}

package �ڹ�������ch07;

public class TotalEx07_2 {

	public static void main(String[] args) {

		//SutdaDeckŬ������ ���ο� �޼��带 �߰��ϰ� �׽�Ʈ�ϱ�
//		1.�޼���� : shuffle
//		  ��� : �迭 cards�� ��� ī���� ��ġ�� �ڼ��´�(Math.random()���)
//		  ��ȯ : x
//		  �Ű����� : x
		
//		2.�޼���� : pick
//		  ��� : �迭 cards���� ������ ��ġ�� SutdaCard�� ��ȯ 
//		  ��ȯ : SutdaCard
//		  �Ű����� : int index - ��ġ
		
//		3.�޼���� : pick
//		  ��� : �迭 cards���� ������ ��ġ�� SutdaCard�� ��ȯ (Math.random()���)
//		  ��ȯ : SutdaCard
//		  �Ű����� : x
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

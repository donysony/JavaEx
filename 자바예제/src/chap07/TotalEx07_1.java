package �ڹ�������ch07;

//		����ī�� 20���� �����ϴ� ����ī�� �� ��(SutdaDeckŬ����)�� ����
//		����ī�� 20���� ��� SutdaCard�迭�� �ʱ�ȭ�Ͻÿ�
//		��, ����ī��� 1���� 10������ ���ڰ� ���� ī�尡 �� �־� �ְ�, ���ڰ� 1,3,8�� ���
//		�� ���� ������ ��(Kwang)�̾���Ѵ�
//		��, SutdaCard�� �ν��Ͻ� ���� isKwang�� ���� true�̾���Ѵ�

//class SutdaDeck{
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM]; //�迭�� �����Ѱ�! ��ü�� ���� �������� �ʾ���
//	
//	SutdaDeck() {
//		//cards�迭 �ʱ�ȭ�ϱ� 1~10������ �� �ι� ����������
//		for(int i=0;i<cards.length;i++) {
//			int num = i%10+1;
//			boolean isKwang = (i<10) && (num==1||num==3||num==8);
//			
//			cards[i] = new SutdaCard(num, isKwang); //��ü�� �����ؼ� ���� �־������!!!!
//		}
//		
//		}
//		
//		
//	}

	class SutdaDeck1{
		final int CARD_NUM = 20;
		SutdaCard[] cards = new SutdaCard[CARD_NUM];
		
		SutdaDeck1() {
			for(int i=0; i<cards.length;i++) {
				int num = i%10+1;
				boolean isKwang = (i<10 && (num==1||num==3||num==8));
				cards[i]=new SutdaCard(num, isKwang);
			}
		}
		
	}


class SutdaCard1{
	int num;
	boolean isKwang;
	
	SutdaCard1(){
		this(1, true);
	}
	
	SutdaCard1(int num, boolean isKwang){
		this.num = num;
		this.isKwang=isKwang;
	}
	//info() ��� objectŬ������ toString()�� �������̵���
	public String toString() {
		return num+(isKwang ? "K":"");
			
	}
}


public class TotalEx07_1 {

	public static void main(String[] args) {
		
		
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i<deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
		
	}

}

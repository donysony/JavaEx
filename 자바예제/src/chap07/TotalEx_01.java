package chap07;
//6�� 12�� ����
//����������-������ �����ʰ� Ǯ���ֵ���!!
class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		//�迭 SutdaCard�� �ʱ�ȭ
		for(int i=0;i<cards.length;i++) {
			int num = i%10+1; //num���� 1~10�� �ι� ���� �� �ֵ��� �س���
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);//���ǽ��� ���� true�϶� k�� ��������
			
			cards[i]=new SutdaCard(num, isKwang);//������ �迭�� ����ī�� ��ü ����
			
		}
		
	}
}
class SutdaCard{
	int num;
	boolean isKwang;
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	//info()��� ObjectŬ������ toString()�� �������̵���
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}
public class TotalEx_01 {

	public static void main(String[] args) {
		
//		7-1
//		����ī�� 20���� �����ϴ� ����ī�� �� ��(SutdaDeckŬ����)�� ���� 
//		����ī�� 20���� ��� SutdaCard�迭�� �ʱ�ȭ �Ͻÿ� ��, ����ī��� 1���� 10������ ���ڰ� ���� ī�尡 �ѽ־� �ְ�, ���ڰ� 1,3,8�� ��쿡�� �� ���� �� ���� ���̾���Ѵ�
//		��, SutdaCard�� �ν��Ͻ� ���� isKwang�� ���� true�̾����
		
		SutdaDeck deck = new SutdaDeck();
		for(int i= 0; i<deck.cards.length;i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		
		
		
		
		
		
		
	}

}

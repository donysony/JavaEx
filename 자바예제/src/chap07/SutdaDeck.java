package �ڹ�������ch07;
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang=isKwang;
	}
	//info() ��� objectŬ������ toString()�� �������̵���
	public String toString() {
		return num+(isKwang ? "K":"");
			
	}
}

public class SutdaDeck {

	final int CARD_NUM =20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length;i++) {
			int num = i%10+1;
			boolean isKwang = (i<10) && (num==1||num==3||num==8);
			cards[i]=new SutdaCard(num, isKwang);
		}
	}
	
	//cards�� ��� ī���� ��ġ�� �ڼ��´�
	public void shuffle() {
		for(int i=0;i<cards.length;i++) {
			int j = (int)(Math.random()*cards.length);
			//cards[i]�� cards[j]�� ���� ���� �ٲ�
			SutdaCard tmp=cards[i];
			cards[i]=cards[j];
			cards[j]=tmp;
		}
	}
	//�迭 cards���� ������ ��ġ�� SutdaCard��ȯ
	public SutdaCard pick(int index){
		//��ȿ���˻����ֱ�!
		if(index<0||index>=CARD_NUM)
			return null;
		return cards[index];  
	}
	
	//�迭 cards���� ������ ��ġ�� SutdaCard��ȯ(Math.random()���)
	public SutdaCard pick() {
		int index=(int)(Math.random()*20);
		return pick(index);//pick(int index)ȣ��
	}
	
}

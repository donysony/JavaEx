package 자바의정석ch07;
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
	//info() 대신 object클래스의 toString()을 오버라이딩함
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
	
	//cards에 담긴 카드의 위치를 뒤섞는다
	public void shuffle() {
		for(int i=0;i<cards.length;i++) {
			int j = (int)(Math.random()*cards.length);
			//cards[i]와 cards[j]의 값을 서로 바꿈
			SutdaCard tmp=cards[i];
			cards[i]=cards[j];
			cards[j]=tmp;
		}
	}
	//배열 cards에서 지정된 위치의 SutdaCard반환
	public SutdaCard pick(int index){
		//유효성검사해주기!
		if(index<0||index>=CARD_NUM)
			return null;
		return cards[index];  
	}
	
	//배열 cards에서 임의의 위치의 SutdaCard반환(Math.random()사용)
	public SutdaCard pick() {
		int index=(int)(Math.random()*20);
		return pick(index);//pick(int index)호출
	}
	
}

package 자바의정석ch07;

//		섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의
//		섯다카드 20장을 담는 SutdaCard배열을 초기화하시오
//		단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 숫자가 1,3,8인 경우
//		둘 중의 한장은 광(Kwang)이어야한다
//		즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야한다

//class SutdaDeck{
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM]; //배열만 생성한것! 객체는 아직 생성하지 않았음
//	
//	SutdaDeck() {
//		//cards배열 초기화하기 1~10까지의 수 두번 나오도록함
//		for(int i=0;i<cards.length;i++) {
//			int num = i%10+1;
//			boolean isKwang = (i<10) && (num==1||num==3||num==8);
//			
//			cards[i] = new SutdaCard(num, isKwang); //객체를 생성해서 값을 넣어줘야함!!!!
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
	//info() 대신 object클래스의 toString()을 오버라이딩함
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

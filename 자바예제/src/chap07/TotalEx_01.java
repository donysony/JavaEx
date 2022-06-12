package chap07;
//6월 12일 문제
//답지보며함-다음엔 보지않고 풀수있도록!!
class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		//배열 SutdaCard를 초기화
		for(int i=0;i<cards.length;i++) {
			int num = i%10+1; //num에다 1~10을 두번 넣을 수 있도록 해놓음
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);//조건식을 통해 true일때 k가 나오도록
			
			cards[i]=new SutdaCard(num, isKwang);//생성된 배열에 섯다카드 객체 생성
			
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
	//info()대신 Object클래스의 toString()을 오버라이딩함
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}
public class TotalEx_01 {

	public static void main(String[] args) {
		
//		7-1
//		섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의 
//		섯다카드 20장을 담는 SutdaCard배열을 초기화 하시오 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있고, 숫자가 1,3,8인 경우에는 둘 중의 한 장은 광이어야한다
//		즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야함
		
		SutdaDeck deck = new SutdaDeck();
		for(int i= 0; i<deck.cards.length;i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		
		
		
		
		
		
		
	}

}

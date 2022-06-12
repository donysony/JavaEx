package chap06;

public class TotalEx_03 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "홍길동";
		s.ban = 1;
		s.no =1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
	
}
class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public int getTotal() {
		
		return kor+eng+math;
	}
//	public float getAverage() {
//		float result =(int)((kor+eng+math)/3f *10+0.5f)/10f;
//		return result;

	//	답
//반환형 float형, 
//	getTotal()/3f -- 실수형으로 나눈다 
//	getTotal()/3f *10 +0.5f 소수점 둘째자리까지 구하기 위해 10을 곱하고, 반올림한 후 int형으로 변환 왜? 10으로 나눠서 소수점첫째자리만 표현해주고싶음
	float getAverage(){
		return (int)(getTotal()/3f * 10+0.5f)/10f;
	
	}

}

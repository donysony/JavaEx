package chap06;

public class TotalEx_03 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no =1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
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

	//	��
//��ȯ�� float��, 
//	getTotal()/3f -- �Ǽ������� ������ 
//	getTotal()/3f *10 +0.5f �Ҽ��� ��°�ڸ����� ���ϱ� ���� 10�� ���ϰ�, �ݿø��� �� int������ ��ȯ ��? 10���� ������ �Ҽ���ù°�ڸ��� ǥ�����ְ����
	float getAverage(){
		return (int)(getTotal()/3f * 10+0.5f)/10f;
	
	}

}

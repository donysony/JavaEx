package chap03;

public class TotalEx_06 {

	public static void main(String[] args) {
//		ȭ��(Fahrenheit)�� ����(ceicius)�� ��ȯ�ϴ� �ڵ��̴�
//		��ȯ���� : C=5/9 * (F-32)
//		�Ҽ��� ��°�ڸ����� �ݿø��ϱ�
//		Math.round()������� �ʰ� ó���ϱ�
		
		
		int fahrenheit =100;
		float celcius = (int)(5f/9 * (fahrenheit-32)*100+0.5)/100f;
		// 5/9�� �ϸ� �������������̱� ������ 0�� ���´� ������ float������ ������ֱ�
		// �Ҽ��� ��°�ڸ����� �ݿø� �ϱ� ���ؼ� 10�� ����� ���� �ݿø� �ϱ� ���� ��ġ�� ���ܿ´�
		//������ ������ ������ ������ �ϱ� ������ 0.5�� ���Ͽ� �ݿø��� ���ش�
		//�ռ� ������ int������ ��ȯ���ָ� �Ҽ����Ʒ��� �������� ������ ���´�
		//�� ���¿��� 10�� �����ŭ �������ְ� float���� ���߾��ָ� ��!
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
		
		
	}

}

package �ڹ�������;

public class TotalEx06_20 {

//		�޼���� :max
//		��� : �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ
//			  ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�ΰ��, -999999�� ��ȯ
//		��ȯŸ��: int
//		�Ű����� : int[] arr - �ִ밪�� ���� �迭
	
	
		int max(int[] arr) {
			for(int i=0; i<arr.length;i++) {
				if(arr[i]>arr[i+1]) {
					
				}
			}
		}
	
		
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪 : "+max(data));
		System.out.println("�ִ밪 : "+max(null));
		System.out.println("�ִ밪 : "+max(new int[] {}));//ũ�Ⱑ 0�� �迭

	}
}
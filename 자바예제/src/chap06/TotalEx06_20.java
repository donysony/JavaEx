package �ڹ�������;

public class TotalEx06_20 {

//		�޼���� :max
//		��� : �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ
//			  ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�ΰ��, -999999�� ��ȯ
//		��ȯŸ��: int
//		�Ű����� : int[] arr - �ִ밪�� ���� �迭
	
	
		static int max(int[] arr) { // ��ü���� ���߱⶧���� static�ٿ�����
			if(arr==null||arr.length==0){ //arr�� null�ΰ��� ũ�Ⱑ 0�ΰ��
				return -999999;
			}
			int max = arr[0];//���� ��ġ�߿�, �迭�� ù��° ������ �ִ밪�� �ʱ�ȭ
			for(int i=1; i<arr.length;i++) { //[0]��° ���� max�� �־����� �� ���� �ε������� üũ
				if(max < arr[i]) {
					max=arr[i];
				}
			}
			return max;
		}
	
		
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪 : "+max(data));
		System.out.println("�ִ밪 : "+max(null));
		System.out.println("�ִ밪 : "+max(new int[] {}));//ũ�Ⱑ 0�� �迭

	}
}
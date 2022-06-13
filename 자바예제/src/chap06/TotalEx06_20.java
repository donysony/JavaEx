package 자바의정석;

public class TotalEx06_20 {

//		메서드명 :max
//		기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환
//			  만일 주어진 배열이 null이거나 크기가 0인경우, -999999를 반환
//		반환타입: int
//		매개변수 : int[] arr - 최대값을 구할 배열
	
	
		int max(int[] arr) {
			for(int i=0; i<arr.length;i++) {
				if(arr[i]>arr[i+1]) {
					
				}
			}
		}
	
		
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : "+max(data));
		System.out.println("최대값 : "+max(null));
		System.out.println("최대값 : "+max(new int[] {}));//크기가 0인 배열

	}
}
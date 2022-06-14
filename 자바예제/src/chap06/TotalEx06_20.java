package 자바의정석;

public class TotalEx06_20 {

//		메서드명 :max
//		기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환
//			  만일 주어진 배열이 null이거나 크기가 0인경우, -999999를 반환
//		반환타입: int
//		매개변수 : int[] arr - 최대값을 구할 배열
	
	
		static int max(int[] arr) { // 객체생성 안했기때문에 static붙여야함
			if(arr==null||arr.length==0){ //arr이 null인경우와 크기가 0인경우
				return -999999;
			}
			int max = arr[0];//선언 위치중요, 배열의 첫번째 값으로 최대값을 초기화
			for(int i=1; i<arr.length;i++) { //[0]번째 값을 max에 넣었으니 그 다음 인덱스부터 체크
				if(max < arr[i]) {
					max=arr[i];
				}
			}
			return max;
		}
	
		
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : "+max(data));
		System.out.println("최대값 : "+max(null));
		System.out.println("최대값 : "+max(new int[] {}));//크기가 0인 배열

	}
}
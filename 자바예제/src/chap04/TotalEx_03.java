package chap04;

public class TotalEx_03 {

	public static void main(String[] args) {
		//3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) �� ����� ����Ͻÿ�
				int sum=0;
				
				for(int j =1;j<=10;j++) {
					for(int i =1; i<=j; i++) {
						sum+=i;
					}
				}
				System.out.println(sum);			
				
//				å
//				int sum = 0;
//				int totalSum = 0;
//				for(int i=1; i <=10; i++) {
//				sum += i;
//				totalSum += sum;
//				}
//				System.out.println("totalSum="+totalSum);
	}

}

package chap04;

public class TotalEx_11 {

	public static void main(String[] args) {
//		별찍기
//		*
//		**
//		***
//		****
//		*****
		
		
//		for(int i = 0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");				
//			}
//			System.out.println();
//		}
		
		//역순으로 별찍기
//		*****
//		****
//		***
//		**
//		*

//		
//		for(int i=0;i<5;i++) {
//			for(int j=5;j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
				
		
		//홀수 출력
//		*
//		***
//		*****
//		*******		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//피라미드모양으로 별찍기
//		    *
//		   ***
//		  *****
//		 *******
//	    *********
		
		for(int i =1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}

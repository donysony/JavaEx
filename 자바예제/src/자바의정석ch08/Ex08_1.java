package 자바의정석ch08;

public class Ex08_1 {
	public static void main(String args[]) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		}catch(Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
	}
	
	
	
}

package E5_배열5_알고리즘;import java.util.Arrays;

public class 배열5_알고리즘_삼각형그리기_문제 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		System.out.println("--------------");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j < 3 - i; j++) {
				System.out.println("J : " + j  );
				System.out.print("#");
			}
			System.out.println();
			
		}
		
		System.out.println("--------------");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for(int j = 0; j < 2 - i; j++) {
				System.out.print("#");
			}		
			System.out.println();
		}
		System.out.println("---------------------------");
		
		for(int i=0; i < 5; i++) {
			for(int j = 0; j <= 3-i; j++) {
				System.out.print(" ");

			}
			for(int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}

}

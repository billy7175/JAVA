package E5_�迭5_�˰���;import java.util.Arrays;

public class �迭5_�˰���_�ﰢ���׸���_���� {

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

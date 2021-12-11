package E5_배열5_기본이론4;

public class 배열5_기본이론1_2차원배열 {
	
	public static void main(String[] args) {
		int darr[][] = new int[3][3];		
		int darr2[][] = new int[4][2];		
		darr2[1][1] = 10;
		
		darr[0][0] = 10;
		darr[0][1] = 20;
		darr[0][2] = 30;
		darr[1][0] = 40;
		darr[1][1] = 50;
		darr[1][2] = 60;
		darr[2][0] = 70;
		darr[2][1] = 80;
		darr[2][2] = 90;
		
		for(int i = 0; i < darr.length; i++) {
			for(int j = 0; j < darr[i].length; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
			System.out.println("123123");
		}

	}

}

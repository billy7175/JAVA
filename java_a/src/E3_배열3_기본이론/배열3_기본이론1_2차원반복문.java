package E3_배열3_기본이론;

public class 배열3_기본이론1_2차원반복문 {

	/*
	 * [2차원 반복문]
		 	반복문 2개를 사용해서 직사각형의 데이터를 표현할수있다.
			1) 첫번째  반복문 (i) 가 세로를 담당한다.
			2) 두번째  반복문 (j) 가 가로를 담당한다.
	 */
	public static void main(String[] args) {
//		int a[] = new int[4];
//		int b[] = new int[4];
		
		for(int i=0; i<4; i++ ) {
			
			for(int j=0; j < 3; j++) {
				System.out.println("[i] == " + i + "[j] == " + j);
				
			}
		}
		
		System.out.println("*-----------*");
		
		for(int i = 0; i < 12; i++) {
			System.out.print(i);
			if(i % 3 == 2) {
				System.out.println();
			}
		}
	}

}

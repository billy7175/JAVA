package E1_배열1_기본이론;

public class 배열1_기본이론3_기본문제1_문제 {
	/*
	 [문제1] 10부터 50까지 array 배열에 저장후 배열안의 모든값을 출력한다.
	 [예] 10 20 30 40 50

	 [문제2] array 배열안의 모든값의 합을 출력한다.
	 [예] 150
*/
	public static void main(String[] args) {
		int array [] = {10,20,30,40,50};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total += array[i];
		}
		
		System.out.println("합 : " + total);
	}

}

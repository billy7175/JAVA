package D2_반복문_기본문제1;

public class D2_기본문제1_문제 {
	/*
    [문제1] 1~4까지 출력
	 [정답1] 1,2,3,4

	 [문제2] 4~1 까지 거꾸로 출력
	 [정답2] 4,3,2,1

*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		while (a <= 4) {
			System.out.println(a);
			a = a +1;
		}
		
		System.out.println("---------------------------------------------");
		
		int b = 4;
		while (b >= 1) {
			System.out.println(b);
			b = b - 1;
		}
	}

}

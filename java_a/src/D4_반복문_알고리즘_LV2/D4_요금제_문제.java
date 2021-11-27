package D4_반복문_알고리즘_LV2;

public class D4_요금제_문제 {

	/*
	 * [문제]
			  아래와같은 휴대요금제가 있다 
			  B를 선택할경우 A보다 더 경제적이될려면,
			  통화시간을 얼마까지 사용해야될까요? 
			  정답을 초로 구하시오.
			  A요금제 기본요금 17500원 초당 5원 
			  B요금제 기본요금 31000원 초당 2원
		  
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 17500;
		int b = 31000;
		int a추가 = 0;
		int b추가 = 0;
		boolean run = true;
		while(run == true) {
			if(a + a추가 > b + b추가 ) {
				System.out.println(a추가 / 5);
				System.out.println(b추가 /2);
				run = false;
			}
			a추가 = a추가 +5;
			b추가 = b추가 +2;
		}

	}
}

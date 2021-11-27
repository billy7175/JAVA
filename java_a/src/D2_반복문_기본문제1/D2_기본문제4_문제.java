package D2_반복문_기본문제1;

public class D2_기본문제4_문제 {
	/*
    
	 [문제] 아래조건을 충복하는 식을 작성하시오.
	  [조건1] 1~10까지 반복문을 실행한다.
	  [조건2] 숫자가 짝수일떄는 "짝수" 출력한다.
	  [조건2] 숫자가 홀수일떄는 "홀수" 출력한다.
	 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10 ) {
			if(i % 2 == 0 ) {
				System.out.println(i);
				System.out.println("짝수");
			} else {
				System.out.println(i);
				System.out.println("홀수");
			}
//			System.out.println(i);
			i = i +1;
		}
	}

}

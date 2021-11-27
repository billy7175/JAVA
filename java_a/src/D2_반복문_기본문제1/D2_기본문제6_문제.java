package D2_반복문_기본문제1;

public class D2_기본문제6_문제 {
	/* 
	 [문제] 1~10까지 반복문을실행하고 3의배수의 개수를 출력하시오.			 
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i <= 10 ) {
			if(i % 3 ==0) {
				System.out.println(i);
			}
//			System.out.println(i);
			i = i + 1;
		}
	}

}

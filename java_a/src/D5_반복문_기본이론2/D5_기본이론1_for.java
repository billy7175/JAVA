package D5_반복문_기본이론2;

public class D5_기본이론1_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		while(a <= 10) {
			System.out.println(a);
			a += 1;
		}
		
		System.out.println("--------------------------------------");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		
		/*
		 *  [1] for
		 *  [2] while과 다르게 세미클론의 위치가 다르다.
		 * 	[3] 초기식 조건식 증감식 을 한줄로 표현한다.
		 * 	[4] for문의 초기식떄 사용한 변수는 for와 함께 소멸한다.  

		 * */
	}

}

package D8_반복문_알고리즘_LV4;

public class D8_학생수_문제 {
	/*
	[문제] 
	
		6과 8의 공약수를 모두 출력
	
		 공약수란 위두수의 공통인약수를 말한다.
		 예)    
		 	6 의약수는 1, 2, 3, 6 이다.
		    8 의약수는 1, 2, 4, 8 이다.
		    
		 6과 8의 공약수는  1, 2 이다.
		 6과 8의 최대공약수는 2 이다.
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 8;
		int i = 1;
		int num = 0;
		while(true) {
			if(i == a ) {
				break;
			}
			if(a % i == 0 && b % i == 0) {
				System.out.println(i);
				num = i;
			}
			if(b % i == 0) {
				System.out.println(i);
			}
			System.out.println("--------");
			i = i +1;
		}
		System.out.println("최대 공약수 : " + num);
	}

}

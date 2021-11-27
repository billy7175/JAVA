package D8_반복문_알고리즘_LV4;

public class D8_학생빨간구슬_문제 {
	/*
	 * [문제]
	  
	    파란구술 50개와 빨간 구술 70개를 최대한 많은 학생들에게 똑같이 나누어줄려고한다.
		파란구슬은 5개가남고 빨간구슬은 2개가 부족할때, 다음물음에 답하여라.
		1) 학생수는 얼마인가요?
		2) 학생당 받게되는 빨간구슬의 개수를 구하여라 .
		3) 학생당 받게되는 파란구슬의 개수를 구하여라 .
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int blue = 50 - 5;
		int red = 70 + 2;
		int student = 0;
		
		while(true) {
			if(i == blue) {
				break;
			}
			
			if(blue % i == 0 && red % i ==0) {
				System.out.println(i);
			}
			
			i +=1;
		}
		
		System.out.println((blue + 5) / student);
		System.out.println((red -2) / student);
	}

}

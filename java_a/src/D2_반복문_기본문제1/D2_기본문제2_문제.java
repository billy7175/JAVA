package D2_반복문_기본문제1;

public class D2_기본문제2_문제 {
	/*
    [문제] 아래조건을 만족하는 식을 작성하시오.  
      [조건1] 1~10까지 반복문을 실행한다.
      [조건2] 1~5까지는 숫자대신 "안녕"을 출력한다. 
      [조건3] 6~10까지는 숫자를 출력한다.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i <= 10) {
			if(i <= 5) {
				System.out.println("안녕");
			} else {
				System.out.println(i);
			}
			
//			System.out.println(i);
			i = i +1;
			
		}
	}

}

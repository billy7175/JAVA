package C5_조건문_기본이론3;

public class C5_기본이론3_if옵션_else {
	/*
  	[if 문의 옵션 2종류] 
  	
  	- else 
  	- else if 	  			
	조건이 2가지인경우 else 를 이용해서 2번째 조건을 생략할수있다. 			
 */
	public static void main(String[] args) {
		// else
		// if 문의 추가 옵션이기 때문에 보조로 사용한다.
		int id = 1234;

		System.out.println("---------------------");
		if(id == 1234) {
			System.out.println("로그인");
		} else {
			System.out.println("로그인 실패2");
		}
	}

}

package A5_산술연산자_알고리즘_LV4;

public class A5_데이트_문제 {
	/*
	  [설명] 
	 	- 철수와 영희는 50000원 을 가지고있다. 
	 	- 철수와 영희는 같이 영화 1편을 봤다.
	 	- 간식은 팝콘1개와 콜라 2개를 사먹었다.
	  [문제] 남은돈은 얼마인가? 
	  [힌트] 
	 		1) 콜라1개는  팝콘1개 보다 4000원 싸다.
	 		2) 영화 1편의 가격은 12000 원이다.
	 		3) 팝콘의 가격은 영화의  6/10 가격이다.  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("영화 : " + 12000 * 2);
		System.out.println("팝콘 : "+ 12000/10 * 6);
		System.out.println("콜라 : "+ (7200 -4000)* 2 );
		System.out.println("거스름돈 : " + (50000 - 24000 - 7200 - 6400));
	}

}

package D6_반복문_기본이론3;

public class D6_기타이론4_삼항연산자 {
	/*
	 *  [삼항연산자]  비교1 ? 비교2 : 참 : 거짓 
	 *  
	 *  int c =	( a == 10 ? 1 : -1 ); 
	 *  	
	 *  a == b 가 사실이면 1 을 c에 저장한다.
	 *  a == b 가 거짓이면 -1 을 c에 저장한다.
	 *  
		지금은 그냥 if문으로 하는것이 편하다. 
		익숙해지면 나중에 저절로 쓰게된다. 
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		if(a == 10) {
			b = 1;
		}else  {
			b = -1;
		}
		System.out.println(b);

		
		int c = (a == 10 ? 1 : -1); 
		// a == 10 인게 사실이면 ?  1 을 c에저장 
		// a == 10 인게 거짓이면 ? -1 을 c에저장 
		System.out.println(c);
		
		
		
	}
}
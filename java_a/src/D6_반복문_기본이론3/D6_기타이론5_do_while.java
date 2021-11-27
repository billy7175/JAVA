package D6_반복문_기본이론3;

public class D6_기타이론5_do_while {
	/*
	[do while] 
	
	 while 의 변형된형태이다.
	 while 과 별차이없다. 

	 1)  do          ==> 일단 실행부터 한다. 
	 2) { 실행영역 }   ==> 실행이 끝난후 조건을 검사한다.
	 3) while(조건);  ==> 조건이 사실이면  다시 do 로 이동 한다. 
	 4) 주의 ; 을 반드시 붙여야한다. 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			System.out.println(i);
			i += 1;
		} while(i <= 10);
	}

}

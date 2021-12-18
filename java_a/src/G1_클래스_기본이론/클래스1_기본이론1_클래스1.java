package G1_클래스_기본이론;
/*
 * [클래스] 
 * 	1. 내가 직접 자료형을 설정한 배열 : 기존자료형을 조합해서 만든다.
 * 	2. 데이터 : x , y 
 *  3. 순서 : 
 *       (1) 정의 : 내용정의   ==>  class{ 이안에 한다. }
 *  	 (2) 선언 : 데이터 할당 ==>  클래스명 변수명 = new 클래스명();
 *  	 (3) 사용 : 변수명 + . 을 이용해서 사용한다. 
 */

class Test01{
	int x;
	int y;
}

public class 클래스1_기본이론1_클래스1 {

	public static void main(String[] args) {		
		
		Test01 t1 = new Test01();
		t1.x = 10;
		t1.y = 20;
		
		System.out.println(t1.x);
		System.out.println(t1.y);
	}

}

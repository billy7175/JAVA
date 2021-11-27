package D6_반복문_기본이론3;

public class D6_기타이론1_switch1 {
	/*
	 * 	스위치 케이스 (switch case)
	 *  사용예 : 비교대상이 전부 ==(같다) 일때만 사용가능하다.
	 *  모양이 많이 불편하다. (if만 사용해도 무방하다.)
	 *  
	 * 1) switch    ==> 키워드
	 * 2) (값)       ==> 비교할값 
	 * 3) {}    	==> 영역 
	 * 4) case 값:   ==> 비교할값 
	 * 5)  내용  break ==> 비교할값과 내용 
	 */	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 1;
		switch(b) {
			case 1 :
				System.out.println(1);
				break;
			case 2 :
				System.out.println(2);
				break;
		}
	}

}

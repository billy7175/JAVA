package D6_반복문_기본이론3;

public class D6_기타이론2_switch2 {
	/*
	 * 	스위치 케이스 (switch case)
	 *  사용예 : 비교대상이 전부 ==(같다) 일때만 사용가능하다.
	 *  모양이 많이 불편하다. (if만 사용해도 무방하다.)
	 *  
	 *  [1] default ==> if문의 else와 같은역활을한다.
	 */	
	public static void main(String[] args) {
		int a = 1;
		if(a == 1) {
			
		} else if(a == 2) {
			
		} else {
			
		}
		
		System.out.println("--------");
		int b = 1;
		switch(b) {
			case 1 :
				System.out.println(b);
				break;
			case 2 : 
				System.out.println(b);
			default: 
				System.out.println(b);
				break;
		}

	}

}

package C4_조건문_알고리즘_LV2;

public class C4_도화지_문제 {
	/*
  	[문제]
		민수네 반 학생은 26명입니다
		민수네반 학생들에게 도화지를 2 장씩 나누어 주려고합니다.
		도화지는 10장씪 묶음으로만 판매하고 10장에 1200원입니다. 
	 */
	public static void main(String[] args) {
		int 학생수 = 26;
		int 필수도화지 = 학생수*2;
		int 도화지 = 10;
		int 가격 = 1200;
		int 묶음 = 필수도화지 / 도화지;
		if(필수도화지 % 도화지 > 0 ) {
			묶음 = 묶음 + 1;
		}
		System.out.println("필요한 묶음 수 "+ 묶음);
		System.out.println("총 가격: " + (묶음 * 가격));
				
	}

}

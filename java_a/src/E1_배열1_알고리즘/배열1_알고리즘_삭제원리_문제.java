package E1_배열1_알고리즘;

import java.util.Arrays;

public class 배열1_알고리즘_삭제원리_문제 {
	/*
	 * 	[문제]
	 *  아래배열 a 의 안에 있는 값을 하나 입력받는다.
	 *  b배열안에 위에서 입력한 값을 제외하고 복사한다.
	 *  
	 *  [예] 30 ==> b[] = {10,20,40,50,0};
	 *  
	 *  [문제] 
	 *  아래 배열 c는 번호와 값이 한쌍인 배열이다. 
	 *  번호를 하나를 입력받고 c배열에 있는 번호이면, 
	 *  그번호와  값만 제외하고 d배열에 복사한다.
	 *  
	 *  [예] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
	 *  
	 */
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		int value = 30;
		int book = 0;
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != value) {
				b[book] = a[i];
				book += 1;
				System.out.println("b[i]에 들어간 값은 :" + a[i]);
			}
			System.out.println(b[i]);
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}

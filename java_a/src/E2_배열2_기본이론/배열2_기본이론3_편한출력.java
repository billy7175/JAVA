package E2_배열2_기본이론;

import java.util.Arrays;

public class 배열2_기본이론3_편한출력 {
	/*
	 *  배열의 전체값을 출력하기쉬운 방법 
	 *  (예) arr1[] = {1,2,3,4};
	 * 
	 *  [1] import java.util.Arrays; 
	 *  [2] Arrays.toString(arr1)
	 *  
	 *  실제 내부는 아래와같이 만들어져있다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		for(int i=0; i < arr.length; i++) {
			if(i < arr.length -1) {
				System.out.print(arr[i] + ",");
			} else {
				
				System.out.print(arr[i]);
			}
		}
		System.out.println("----------------");
		System.out.println(Arrays.toString(arr));
	}

}

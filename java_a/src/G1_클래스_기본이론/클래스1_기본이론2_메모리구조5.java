package G1_클래스_기본이론;

import java.util.Arrays;

class Sample4{
	int arr[][] = new int[4][];
}

public class 클래스1_기본이론2_메모리구조5 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {11,12,13,14,15};
		
		
		Sample4 s4 = new Sample4();
	
		s4.arr[0] = arr1;
		s4.arr[1] = arr2;
		s4.arr[2] = arr1;
		s4.arr[3] = arr2;
		
		s4.arr[1][1] = 100;
			
		for(int i = 0; i < s4.arr.length; i++) {
			System.out.println(Arrays.toString(s4.arr[i]));
		}
	}
}

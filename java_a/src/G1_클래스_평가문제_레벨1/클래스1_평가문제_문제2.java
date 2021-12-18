package G1_클래스_평가문제_레벨1;

import java.util.Arrays;
import java.util.Random;

class Sample2{
	int arr[] = {10,20,30,40,50};
}

public class 클래스1_평가문제_문제2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		
		
		Sample2 s2 = new Sample2();
		s2.arr = arr;
			
		
		
		//문제1) 답을 예상후 주석 풀고 실행
		//System.out.println(Arrays.toString(s2.arr));
		
		s2.arr = null;	
		//문제2) 답을 예상후 주석 풀고 실행
		//System.out.println(Arrays.toString(arr));
		
	}
}

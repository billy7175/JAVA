package G1_클래스_평가문제_레벨1;

import java.util.Arrays;

class Sample3{
	int arr[] = {10,20,30,40,50};
}

public class 클래스1_평가문제_문제3 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		Sample3 s3 = new Sample3();
	
		Sample3 temp3 = s3;
		s3 = null;
		s3.arr = arr;
			
		//문제1) 답을 예상후 주석 풀고 실행
		//System.out.println(Arrays.toString(temp3.arr));
		
		//문제2) 답을 예상후 주석 풀고 실행
		//System.out.println(Arrays.toString(s3.arr));
		
	}
}

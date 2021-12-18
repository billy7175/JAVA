package H6_메서드리턴1_기본이론;

import java.util.Arrays;

class TestReturn4_1{
	int countMuliple4(int[] arr) { 
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt += 1;
			}
		}
		return cnt; 
	}
	
	int[] countMulipleArray(int[] arr) { 
		int cnt = countMuliple4(arr);
		int[] temp = new int[cnt];
		
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				temp[j] = arr[i];
				j += 1;
			}
		}		
		return temp; 
	}
	
}

class TestReturn4_2{
	int reArr[] = null;
	int cnt = 0;
	void countMuliple4(int[] arr) { 
		cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt += 1;
			}
		}		
	}
	
	void countMulipleArray(int[] arr) { 	
		countMuliple4(arr);
		reArr = new int[cnt];		
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				reArr[j] = arr[i];
				j += 1;
			}
		}			
	}
	
}
public class 메서드리턴1_기본이론4 {
	  	
	public static void main(String[] args) {
		// 리턴은 참조변수도 가능하다.

		
		int[] arr = {87, 12, 21, 56, 100};
		
		System.out.println("[리턴사용할경우]");		
		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드	
		TestReturn4_1 test1 = new TestReturn4_1();
		int cnt1 = test1.countMuliple4(arr);
		System.out.println("cnt1 = " + cnt1);
		
		// 문제 2) 4의 배수만 배열 타입으로 리턴해주는 메서드
		int[] arrTemp1 = test1.countMulipleArray(arr);
		System.out.println(Arrays.toString(arrTemp1));

		System.out.println("-------------------------------");
		System.out.println("[리턴사용안할경우]");
		System.out.println("변수가 2개 추가로 더필요하다.");
		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드		
		TestReturn4_2 test2 =new TestReturn4_2();	
		test2.countMuliple4(arr);		
		int cnt2 = test2.cnt;
		System.out.println("cnt2 = " + cnt2);
		
		// 문제 2) 4의 배수만 배열 타입으로 리턴해주는 메서드
		test2.countMulipleArray(arr);
		int[] arrTemp2 = test2.reArr;
		System.out.println(Arrays.toString(arrTemp2));
	}
}

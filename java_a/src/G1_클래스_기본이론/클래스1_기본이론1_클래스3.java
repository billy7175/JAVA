package G1_클래스_기본이론;

class Test03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class 클래스1_기본이론1_클래스3 {
	public static void main(String[] args) {
//		int arr[] = {1,2,3,4,5};
		Test03 t3 = new Test03();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int total = 0;
		for(int i = 0; i < t3.arr.length; i++) {
			total += t3.arr[i];
		}
		System.out.println("총 합은 : "+total);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int total2 = 0;
		for(int i = 0; i < t3.arr.length; i++) {
			if(t3.arr[i] % 4 == 0) {
				total2 += t3.arr[i];
			}
		}
		System.out.println(total2);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3

	}
}

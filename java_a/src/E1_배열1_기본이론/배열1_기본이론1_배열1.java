package E1_배열1_기본이론;

public class 배열1_기본이론1_배열1 {
	/*
	 * [1] [배열] (array)
	 * [2] int[] arr = new int[3];
	 * [3] 인덱스 (index)
	 *     0 부터 순차적으로 1씩 증가되면서 크기만큼 방번호가 생긴다.
	 * 	   int [] arr = new int[5]; ==> 0, 1, 2, 3, 4
	 * 
	 * [4] 배열은 자동으로 0이 저장된다
	 * [5] arr[0] = 10 /// 각각의 방번호에 값을 저장한다.
	 * [6] arr[3] = 10 // 없는 방에 값을 저장하면 에러난다.
	 * [7] 배열은 0 대신 null 초기화한다.
	 * 
	 * */ 
	public static void main(String[] args) {
		int a = 10;
		int[] arr = new int[3];
		arr[0] = 10;
		arr [2] = 20;
		// arr[3] = 30; 방 번호를 주의해야한다.
		
//		int b;
//		System.out.println();
		int [] brr = new int[3];
		System.out.println(brr[2]);
		int [] ccr = null;
		System.out.println(ccr);
		
	}

}

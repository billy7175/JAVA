package E2_배열2_알고리즘;
import java.util.Arrays;
import java.util.Random;
public class 배열2_알고리즘_셔플 {
	/*
	[셔플] 	
	 1) 인덱스 2개를 랜덤(0~5)으로 저장하고 각 인덱스의 값을 교환한다.
	 2) 위 1번을 10 번 반복하며 과정  출력 		
	예) 1 , 2 ==> {10,30,20,40,50,60};  // 20 과 30이 교환된다.		
	예) 4 , 1 ==> {10,50,20,40,30,60};  // 50 과 30이 교환된다.	
	예) 3 , 3 ==> {10,50,20,40,30,60}; // 같을땐 아무일도안생긴다.
	...
*/
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		Random ran = new Random();
		for(int i=0;  i< 1000; i++) {
			int r = ran.nextInt(arr.length);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
			System.out.println(Arrays.toString(arr));
		}	
		
//		int arr[] = {10,20,30,40,50,60};
//		Random ran = new Random();
//		
//		for(int i = 0; i < 1000; i++) {
//			int r1 = ran.nextInt(arr.length);
//			int r2 = ran.nextInt(arr.length);
//			
//			int temp = arr[r1];
//			arr[r1] = arr[r2];
//			arr[r2] = temp;
//			System.out.print(r1 + " " + r2 + " : ");
//		}
	}

}

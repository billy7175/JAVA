package E8_배열8_기본이론;
import java.util.Arrays;
public class 배열8_기본이론0_메모리구조2 {

	public static void main(String[] args) {
		/*
		 * ram ==> stack , heap , data(static)
		 * 
		 * stack ==> 일반변수 (왼쪽에있는변수)
		 * 
		 * heap ==> new 로만든 변수 (오른쪽에 있는변수)
		 * --------------------------
		 * STACK ==> 지역변수 
		 * HEAP  ==> 객체 (NEW)
		 * DATA  ==> 전역변수 
		 * --------------------------
		 * []가붙은변수는 => new 로만든 변수의 주소를저장.
		 * new를 사용해서 생성된 변수는 힙
		 */
		int [] arr = new int[3];		
		int a = 10;	
		int b = 20;
		System.out.println(arr);		
		int [] temp = arr;	
		temp[1] = 100;	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		arr[0] = 200;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}

}

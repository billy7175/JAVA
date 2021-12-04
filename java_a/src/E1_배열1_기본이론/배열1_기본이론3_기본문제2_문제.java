package E1_배열1_기본이론;

public class 배열1_기본이론3_기본문제2_문제 {
	/*
	 * 	array = {10,20,30,40,50};
	 * 
		[문제1] 4의 배수만 출력한다.
		[예] 20 40
		
		[문제2] 4의 배수의 합을 출력한다.
		[예] 60
		
		[문제3] 4의 배수의 개수를 출력한다.
		[예] 2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {10, 20, 30, 40, 50};
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 4 == 0) {
				System.out.println(array[i] + " ");
			}
		}
		System.out.println();
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
			System.out.println("stacking... : " + total);
		}
		
		System.out.println("Total : " + total);
		
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 4 == 0) {
				count += 1;
			}
		}
		
		System.out.println("개수 : " + count);
	}

}

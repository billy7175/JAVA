package D3_반복문_알고리즘_LV1;

public class D3_배수의가까운값_문제 {
	/*
	  [문제] 
	  		1 에서 200 사이의 숫자중 다음 조건에 맞는 숫자를 출력.
	      	[조건1] 6의 배수중에서 100에 가장가까운 수를 출력 
	 		
	 		정답 : 102
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		boolean run = true;
		while(run == true) {
			System.out.println("num" + num);
			if(num % 6 == 0 && num >= 100) {
				run = false;
			} else {				
				num = num + 1;
			}
		}
		System.out.println("-------------------");
		int left = num - 6;
		int right = num;
		left = 100 - left; // 4
		right= right -100; // 2
		if(left < right) {
			System.out.println(num - 6);
		} else {
			System.out.println(num);
		}
	}

}

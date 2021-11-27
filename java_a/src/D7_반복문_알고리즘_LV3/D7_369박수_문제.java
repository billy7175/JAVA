package D7_반복문_알고리즘_LV3;

public class D7_369박수_문제 {
	/*
	 *  [369게임]
	 * 1. 1~50까지 반복을 한다.
	 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
	 * 
	 * 3. 각각의 숫자에 3이나 6이나 9가 두개 면 "짝짝"
	 * 4. 각각의 숫자에 3이나 6이나 9가 한개 면 "짝"
	 * 5. 3이나 6이나 9가 없으면 그냥 숫자출력 
	 * 
	 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i <= 50) {
			int a = i / 10; // 십의 자리 
			int b = i % 10; // 일의 자리 수
			System.out.println("a : "+ a);
			System.out.println("b : "+ b);
			int count = 0;
			if(a == 3 || a == 6 || a == 9) {
				count += 1;
			}
			if(b == 3 || b == 6 || b == 9) {
				count += 1;
			}
			if(count == 0) {
				System.out.println(i);
			}
			
			if(count == 1) {
				System.out.println("짝");
			}
			
			if(count == 2) {
				System.out.println("짝짝");
			}
//			System.out.println(i);
			i += 1;
			
		}
	}

}

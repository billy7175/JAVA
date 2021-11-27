package D7_반복문_알고리즘_LV3;

public class D7_소수찾기_문제 {

	public static void main(String[] args) {
		int num = 100;
		int count = 0;
		int i = 1;
		while (i <= num) {
			if(num % i == 0 ) {
				count +=1;
			}
			i += 1;
		}
		if(count == 2) {
			System.out.println(num + "는 소수다.");
		} else {
			System.out.println(num + "는 소수가 아니다.");
		}
		
		

	}

}

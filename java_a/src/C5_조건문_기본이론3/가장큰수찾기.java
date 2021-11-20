package C5_조건문_기본이론3;
import java.util.Random;
public class 가장큰수찾기 {

	public static void main(String[] args) {
		// [1] 가장 큰 수 찾기
		// a, b, c 에 랜덤으로 1 ~ 100을 저장 후 가장 큰 수를 출력하세요.
		Random random = new Random();
		int a = random.nextInt(100) + 1;
		int b = random.nextInt(100) + 1;
		int c = random.nextInt(100) + 1;
		int answer = 0; // 가장 큰 수;
		System.out.printf("a : %d,  b: %d, c: %d ", a, b ,c );
		if(a > b) {
			answer = a;
		}
		if(a > c) {
			answer = c;
		}
		
		if(b > a ) {
			answer = b;
		}
		if(b > c ) {
			answer = b;
		}
		
		if(c > a ) {
			answer = c;
		}
		if(c > b) {
			answer = c;
		}
		System.out.println("가장 큰 수는 " + answer + "입니다.");
		
	}

}

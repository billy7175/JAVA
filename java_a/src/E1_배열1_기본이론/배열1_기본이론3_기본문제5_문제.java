package E1_배열1_기본이론;
import java.util.Random;

public class 배열1_기본이론3_기본문제5_문제 {

	/*
	 * [문제]
	 *  array 배열에 0~100사이의 랜덤값 5개 저장후 모든값을 출력한다.
	 */
	public static void main(String[] args) {
		int array1[] = new int[5];
		
		Random random = new Random();
		for(int i = 0; i < array1.length; i++) {
			int randomNumber = random.nextInt(101);
			array1[i] = randomNumber;
			System.out.println("들어간 랜덤 숫자는 : " + randomNumber);
			
		}
	}

}

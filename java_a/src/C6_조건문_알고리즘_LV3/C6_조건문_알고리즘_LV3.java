package C6_조건문_알고리즘_LV3;
import java.util.Scanner;
import java.util.Random;
public class C6_조건문_알고리즘_LV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(10)+1;
//		int yourAnswer;
		System.out.println("참고로 답은 : " + randomNumber);
		System.out.println("홀수 짝수 중 하나를 골라 번호를 입력해주세요.");
		System.out.println("[1] 홀수, [2] 짝수");
		int select = scan.nextInt();
		if(select == 1) {
			if(randomNumber % 2 == 0) {
				System.out.println("오답, 짝수입니다");
			} else {
				System.out.println("정답, 홀수입니다.");
			}
		} else if( select == 2 ){
			if(randomNumber % 2 == 0) {
				System.out.println("정답, 짝수입니다");
			} else {
				System.out.println("오답, 홀수입니다.");
			}
		} else {
			System.out.println("올바른 번호를 입력해주세요.");
		}
		scan.close();
	}

}

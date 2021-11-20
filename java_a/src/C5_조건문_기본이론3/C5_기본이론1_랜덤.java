package C5_조건문_기본이론3;
import java.util.Random;
import java.util.Scanner;
public class C5_기본이론1_랜덤 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int a = random.nextInt(6);
		a = a +1;
		System.out.println(a);
		
		// 5 ~ 10 사이의 랜던값을 출력해보세요.
		int b = random.nextInt(6); // 0 1 2 3 4 5 + 5
		b = b +5;
		System.out.println("b의 값은 = " + b);
		
		int c;
		c = random.nextInt(101) + 50;
		
		// 랜덤구구단
		// [1] 숫자 2개 1~9를 FOSEJADMFH 저장하고, 출력한다.
		// ==> 3 x 5
		// [2] 정답을 입력하고 그 결과가 위 문제와 일치하면 "정답", 틀리면 "오답"
		int firstNum = random.nextInt(9)+1;
		int secondNum = random.nextInt(9)+1;
		int answer = firstNum * secondNum;
		int yourAnswer;
		System.out.println("--------------------------------");
		System.out.println("문제를 풀어주세요.");
		System.out.println("참고로 답은 :  "+ answer);
		System.out.println(firstNum + " X " +  secondNum);
		System.out.println("정답을 입력해주세요 :");
		yourAnswer = scan.nextInt();
		if(answer == yourAnswer) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
		
		scan.close();
		
		
	}

}

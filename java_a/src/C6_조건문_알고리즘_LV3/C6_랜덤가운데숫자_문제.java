package C6_조건문_알고리즘_LV3;
import java.util.Scanner;
import java.util.Random;
public class C6_랜덤가운데숫자_문제 {
	/*
	  
  	[가운데 숫자 맞추기 게임]
  
	   [1] 150~250 사이의 랜덤 숫자 저장한다.
	   [2] 랜덤 숫자의 가운데 숫자를 직접 입력하여 맞추는 게임이다.
	   (예)
  			249		: 4
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int number= random.nextInt(101); // 0 ~ 100;
		number += number = 150;
		System.out.println(number);
		int a = number % 100; // 십의 자리 만들고
		int b = a / 10; // 일의 자리까지
		System.out.println("number = "+ number);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("가운데 숫자를 입력해주세요.");
		int myAnswer = scan.nextInt();
		if(b == myAnswer) {
			System.out.println("정답");
		} else {
			System.out.println("꽝");
		}
		
		scan.close();
	}

}

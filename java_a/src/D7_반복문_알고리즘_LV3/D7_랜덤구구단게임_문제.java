package D7_반복문_알고리즘_LV3;
import java.util.Scanner;
import java.util.Random;


public class D7_랜덤구구단게임_문제 {
	/*
	 *  [랜덤구구단 게임] (반복문사용)
	 * 1. 랜덤구구단 게임을 10회 반복한다.
	 * 2. 정답을 맞추면 1문제당 10점이다.
	 * 3. 게임 종료 후, 성적을 출력한다.
	 * 4. 단, 3번연속으로틀리면 즉시종료하며 0점이된다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int combo = 0;
		
		for(int i=0; i < 10; i++) {
			int a = random.nextInt(8)+2; // 2~9
			int b = random.nextInt(9) + 1; // 1~9
			int answer = a * b;
			System.out.printf("%d * %d = ?", a, b);
			int myAnswer = scan.nextInt();
			if(answer == myAnswer) {
				System.out.println("정답");
				count = count +1;
				combo = 0;
			} else {
				combo = combo +1;
				System.out.println("오답");
			}
			System.out.println("연속실패 : "+ combo);
			if(combo == 3) {
				System.out.println("연속으로" +combo +"실패");
				count = 0;
				break;
			}
					
		}
		System.out.println(count * 10 + "점");

	}

}

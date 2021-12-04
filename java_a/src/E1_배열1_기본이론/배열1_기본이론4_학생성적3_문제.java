package E1_배열1_기본이론;
import java.util.Scanner;

public class 배열1_기본이론4_학생성적3_문제 {
	/*
	 *   numberList = { 1001, 1002, 1003, 1004, 1005 };
		 scoreList = { 87, 11, 45, 98, 23 };
		 [문제] 학번을 입력받아 성적 출력
		 [정답] 학번 입력 : 1003 성적 : 45점
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberList[] = { 1001, 1002, 1003, 1004, 1005 };
		int scoreList[] = { 87, 11, 45, 98, 23 };
		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력해주세요.");
		int number = scan.nextInt();
		System.out.println("입력한 학번 : " + number);
	}

}

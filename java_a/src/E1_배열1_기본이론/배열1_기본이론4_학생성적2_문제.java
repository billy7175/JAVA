package E1_배열1_기본이론;
import java.util.Scanner;
public class 배열1_기본이론4_학생성적2_문제 {
	/*
	 * 	 array = { 87, 11, 45, 98, 23 };
	  
		 [문제1] 인덱스를 입력받아 성적 출력
		 [정답1] 인덱스 입력 : 1 성적 : 11점
	
		 [문제2] 성적을 입력받아 인덱스 출력
		 [정답2] 성적 입력 : 11 인덱스 : 1
	 */
	public static void main(String[] args) {
		int array[] = {87, 11, 45, 98, 23};
		int score = 0;
		for(int i=0; i < array.length; i++) {
			System.out.println("인덱스를 통한 성적 출력 :"+ array[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력받아 인덱스 출력");
		int userScore = scan.nextInt();
		System.out.println("입력한 점수는 : "+ userScore);
		for(int i=0; i<array.length; i++) {
			if(array[i] == userScore) {
				score = i;
			} 
		}
		
		
		if(score == 0) {
			System.out.println("입력하신 점수의 갑을 찾을 수 없습니다.");
		} else {
			
			System.out.println("입력하신 점수의 인덱스 값은 : " + score);
		}
		
		scan.close();
	}

}

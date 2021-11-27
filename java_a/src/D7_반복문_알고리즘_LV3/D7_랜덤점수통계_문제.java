package D7_반복문_알고리즘_LV3;
import java.util.Random;
public class D7_랜덤점수통계_문제 {
	/*
	 * [랜덤점수통계]
	 * 
	 * 1. 10회 반복을 한다.
	 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
	 * 3. 성적이 60점 이상이면 합격생이다.
	 * ---------------------------------------
	 * . [1] 전교생(10명)의 총점과 평균을 출력한다.
	 * . [2] 합격자 수를 출력한다.
	 * . [3] 1등 학생의 번호와 성적을 출력한다.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int total = 0;
		int count = 0;
		int number = 0;
		int maxScore = 0;
		for(int i = 1; i <= 10; i++) {
			
			// [1] 랜덤값출력 
			int r = ran.nextInt(100) + 1; 
			
			// [2] 합격여부 판정
			if(r >= 60) {
				System.out.println(i + "번 학생 합격 : " + r);
				count += 1;
			} else {
				System.out.println(i + "번 학생 불합격 : " +r);
			}
			
			// [3] 1등점수와 1등번호를 저장.
			if(maxScore < r) {
				maxScore = r;
				number = i;
			}
			
			// [4] 전체합 저장 
			total = total + r;
		}
		System.out.println("총점 : " + total + " 평균 : " + total/10.0);
		System.out.println("합격생수 : " + count);
		System.out.println("1등 : " + number + " 점수 : " + maxScore);
	}

}

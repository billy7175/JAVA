package E1_배열1_기본이론;
import java.util.Random;
public class 배열1_기본이론4_학생성적1_문제 {
	/*
		 [문제1] array 배열에 1~100점 사이의 랜덤 정수를 5개 저장하고 출력
		 예)    87, 11, 92, 14, 47
		
		 [문제2] 전교생의 총점과 평균 출력
		 예)    총점(251) 평균(50.2)
		
		 [문제3] 성적이 60점 이상이면 합격. 합격생 수 출력
		 예)   2명
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[5];
		Random random = new Random();
		int total = 0;
		int count = 0;
		double average;
		for(int i=0; i <array.length; i++) {
			array[i] = random.nextInt(100)+1;
			System.out.println("들어간 랜덤 숫자는 :" + array[i]);
			total += array[i];
			if(array[i] >= 60) {
				count += 1;
			}
		
		}
		average = total / 5;
		System.out.println("학생들의 총점 : "+ total);
		System.out.println("학생들의 평균 : " + average);
		System.out.println("합격한 학생의 수 : " + count );
		
	}

}

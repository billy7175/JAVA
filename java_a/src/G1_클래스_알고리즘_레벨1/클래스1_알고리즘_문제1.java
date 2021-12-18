package G1_클래스_알고리즘_레벨1;

import java.util.Arrays;

class Test04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class 클래스1_알고리즘_문제1 {
	public static void main(String[] args) {
		
		Test04 test04 = new Test04();
		
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47

		System.out.println(Arrays.toString(test04.hakbuns));		
		for(int i= 0; i <test04.hakbuns.length; i++) {
			System.out.println("i : " + i);
			test04.scores[i] = test04.hakbuns[i];
		}
		System.out.println("1번. scores에 학번 넣기");
		System.out.println(Arrays.toString(test04.scores));
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		
		int total = 0;
		float average = 0;
		
		for(int i= 0; i <test04.scores.length; i++) {
			System.out.println("플러스 값 : "+ test04.scores[i]);
			total += test04.scores[i];
		}
		average = total / test04.scores.length;
		System.out.println("전교샹의 총점");
		System.out.println("Total : "+  total);
		System.out.println("Average : " + average);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 92점

		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1003번(92점)
	}
}

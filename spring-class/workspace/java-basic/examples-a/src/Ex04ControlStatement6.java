
public class Ex04ControlStatement6 {

	public static void main(String[] args) {
		
		//1. 점수 3개 입력 (정수)
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("점수 1 : ");
		int score1 = scanner.nextInt();
		System.out.print("점수 2 : ");
		int score2 = scanner.nextInt();
		System.out.print("점수 3 : ");
		int score3 = scanner.nextInt();		
		
		//2. 입력된 점수의 합과 평균 계산해서 변수에 저장 (합 : 정수, 평균 : 실수)
		int total = score1 + score2 + score3;
		double mean = total / 3;
		
		//3. 등급을 계산해서 변수에 저장 (평균 기준)
		//   90 ~ 100 : A, 80 ~ 89 : B, 
		//   70 ~ 79 : C, 60 ~ 69 : D, 나머지 : F
		char grade = 'F';
		boolean valid = true;
		
		//1. expression은 실수를 반환할 수 없습니다.
		//2. case의 값은 단일 값 (범위 표현 불가능)
		switch ((int)mean / 10) {
		case 10: 
		case 9:  grade = 'A'; break;
		case 8:  grade = 'B'; break;
		case 7:  grade = 'C'; break;
		case 6:  grade = 'D'; break;
		case 5:  
		case 4:  
		case 3:  
		case 2:  
		case 1:  
		case 0:  grade = 'F'; break;
		default: valid = false; break;
		}
		
		if (valid == true) {
			//4. 출력 : 형식 -> [총점 : 100][평균 : 40점][등급 : A]
			System.out.printf("[총점 : %d][평균 : %.2f][등급 : %c]", 
							  total, mean, grade);
		} else {
			System.out.println("입력에 오류가 있습니다.");
		}
	}

}











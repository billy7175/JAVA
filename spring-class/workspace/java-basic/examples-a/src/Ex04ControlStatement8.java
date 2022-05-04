
public class Ex04ControlStatement8 {

	public static void main(String[] args) {
		
		//0. while review
//		int idx = 0, to = 5;
//		while (idx < to) {
//			
//			idx++; //idx += 1; // idx = idx + 1;
//			System.out.println(idx);
//			
//		}
		
		/////////////////////////////////////////////
		
		//1. while 연습
//		//   50 ~ 150 범위의 난수(정수)를 만들어서 변수에 저장
//		//   합과 평균을 계산해서 변수에 저장
//		//   출력
//		//   사용자에게 계속여부를 입력(y/n)받아서 반복하거나 중단 처리
//		
//		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		
//		int n1 = 0, n2 = 0, total = 0, mean = 0;
//		String yn = "y";
//		
//		//while (yn.equals("y")) {
//		//while (yn.equals("y") || yn.equals("Y")) {
//		//while (yn.equalsIgnoreCase("y")) { // 대소문자 구분X 비교
//		while (yn.toLowerCase().equals("y")) { // 소문자로 변경해서 비교
//			n1 = (int)(Math.random() * 100) + 50;
//			n2 = (int)(Math.random() * 100) + 50;
//			total = n1 + n2;
//			mean = total / 2;
//			System.out.printf("[TOTAL : %d][MEAN : %d]\n", total, mean);
//			
//			//여기서 입력
//			System.out.print("계속할까요(y/n)? : ");
//			yn = scanner.nextLine();
//		}
//		
//		System.out.println("프로그램이 종료됩니다.");
		
		/////////////////////////////////////////////////
		
		//2. do while 연습
//		//   1번의 조건과 동일
//		//   추출한 두 숫자는 각각 100을 넘지 않도록 제한(다시 추출)
//		
//		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		
//		int n1 = 0, n2 = 0, total = 0, mean = 0;
//		String yn = "y";
//		
//		while (yn.toLowerCase().equals("y")) { // 소문자로 변경해서 비교
//			
//			do {
//				n1 = (int)(Math.random() * 100) + 50;
//			} while (n1 > 100);
//			
//			do {
//				n2 = (int)(Math.random() * 100) + 50;
//			} while (n2 > 100);
//			
//			total = n1 + n2;
//			mean = total / 2;
//			System.out.printf("[%d,%d][TOTAL : %d][MEAN : %d]\n", 
//							  n1, n2, total, mean);
//			
//			System.out.print("계속할까요(y/n)? : ");
//			yn = scanner.nextLine();
//		}
//		
//		System.out.println("프로그램이 종료됩니다.");
		
		//////////////////////////////////////////////////
		
		//3. for 연습
//		//   구구단 5단 출력
//		
//		// for (int idx = 1; idx <= 9; idx++) {
//		for (int idx = 1; idx < 10; idx++) {
//			System.out.printf("%d X %d = %2d\n", 5, idx, (5 * idx));
//		}
		
		//4. for 연습
		//   구구단 전체 출력
		for (int y = 1; y < 10; y++) { //세로 방향 출력 반복
			for (int x = 1; x < 10; x++) { //가로 방향 출력 반복
				System.out.printf("%d X %d = %2d  ", x, y, x*y);				
			}
			System.out.println();//줄바꿈
			
		}
		
	}

}












public class Lab1Lotto { // 모든 자바 코드는 클래스 안에 작성

	public static void main(String[] args) { // 프로그램 시작점

		java.util.Scanner scanner = new java.util.Scanner(System.in); // 입력기 생성
		while (true) {
			System.out.println("******************************");
			System.out.println("* 1. 당첨 예상 번호 뽑기.");
			System.out.println("* 2. 종료.");
			System.out.println("******************************");

			System.out.print("작업을 선택하세요 : ");
			String selection = scanner.nextLine(); // 사용자 입력을 문자열(0개 이상의 문자 집합)로 반환
			// System.out.println("your selection is " + selection); // 문자열 + 문자열 -> 문자열 결합

			if (selection.equals("1")) {
				
				System.out.print("당첨 예상 번호 : ");
				for(int i = 0; i < 6; i++) { // i++ : i = i + 1
					int number = (int)(Math.random() * 45) + 1; // 1 ~ 45(45포함)
					System.out.print("[" + number + "]");
				}
				System.out.println();
				
			} else if (selection.equals("2")) {
				System.out.println("행운을 빕니다 !!!!!");
				System.out.println("프로그램을 종료합니다.");
				break; // while 반복문 종료
			} else { // 비정상 입력
				System.out.println("지원하지 않는 명령입니다. ");
			}
		}
	}

}

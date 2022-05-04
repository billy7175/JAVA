
public class Lab2Lotto { // 모든 자바 코드는 클래스 안에 작성

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
				
				// int[] numbers; // 배열 참조변수 만들기
				// numbers = new int[6]; // 정수 6개를 저장할 수 있는 배열 인스턴스 만들고 주소를 저장
				int[] numbers = new int[6];
				for (int i = 0; i < numbers.length; i++) {
					numbers[i] = (int)(Math.random() * 45) + 1;
					for (int j = 0; j < i; j++) { // 중복 검사를 위한 반복문
						if (numbers[i] == numbers[j]) { // 중복된 데이터 발견된다면
							//i = -1;
							i--; // i -= 1, --i, i = i - 1
							break;
						}
					}
				}
				
				System.out.print("당첨 예상 번호 : ");
				for(int i = 0; i < numbers.length; i++) { // i++ : i = i + 1
					System.out.print("[" + numbers[i] + "]");
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

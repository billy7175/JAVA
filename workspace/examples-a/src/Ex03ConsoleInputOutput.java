
public class Ex03ConsoleInputOutput {

	public static void main(String[] args) {
		
		//1. 명령프롬프트에서 사용자 입력 받기
		
		//입력기 만들기
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.nextLine();// 사용자 (키보드) 입력 - 문자열 ( 엔터가 입력될때까지 기다렸다가 전체 입력을 하나의 문자열로 처리 )
		System.out.println(name + "님 반갑습니다.");	
		
		System.out.print("숫자를 입력하세요 : ");
		int number = scanner.nextInt();// 사용자 (키보드) 입력 - 숫자
		System.out.println(number + "를 입력했습니다.");
		
		//2. 명령프롬프트에 출력
		System.out.print("print로 출력"); //끝에 줄바꿈 없는 출력
		System.out.println("println으로 출력"); //끝에 줄바꿈 있는 출력
		String title = "Java";
		int level = 10;
		System.out.println("[TITLE : " + title + "][LEVEL : " + level + "]");
		System.out.printf("[TITLE : %s][LEVEL : %d]", title, level);
	
		//printf에서 사용하는 출력 서식의 종류
		// %s -> 문자열
		// %c -> 문자
		// %d -> 정수
		// %f -> 실수
		// %b -> boolean
		
		//3. 문자열 비교
		System.out.println(); // 줄바꿈
		System.out.print("문자열 입력 : ");
		String str = scanner.nextLine(); // 꼭 abc를 입력해서 테스트 하세요
		String str2 = "abc";
		System.out.println(str == str2); // == : 동일성 비교 ( 내용 비교 X )
		System.out.println(str.equals(str2)); // 문자열의 내용을 비교할 때 반드시 equals 메서드 사용
		System.out.printf("%s, %s", str, str2);
		
		scanner.close(); //사용한 입력기 반환
	}
	
}






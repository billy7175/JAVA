package B1_변수_기본이론;

public class B1_기본이론3_변수의명명규칙 {
	/* # 변수의 명명규칙
	 * 1. 숫자로 시작할 수 없다.
	 * 2. 특수문자는 _, $만을 허용한다. (언더바, 달라만 사용할 수 있다.)
	 * 3. 예약어(키워드)는 사용할 수 없다. ex) public, class, static, void...
	 * 4. 자바는 알파벳의 대소문자를 구분한다.
	 * --------------------------------------
	 * 암죽적인 룰
	 * 변수의 이름이 2개 이상의 단어가 사용될 떄
	 * 카멜표기법과 스네이크 표기법이 있다.
	 * 1. 패키지명과 변수명은 소문자로 시작한다.
	 * 2. 클래스명은 대문자로 시작한다.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		int a = 20;
		System.out.println(A);
		System.out.println(a);
		int playerpower;
		int player_power; // 스네이크 표기법
		int playerPower; // 카멜 표기법
	}

}

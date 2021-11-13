package A1_기본이론;

public class A1_기본이론7_서식문자 {

	//printf(서식문자 , 숫자)
	// %d ==> 정수
	// %f ==> 실수
	// %c ==> 캐릭터
	// %s ==> 스트링
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d", 10);
		System.out.println();
		System.out.println(10);
		System.out.printf("%f", 10.1);
		System.out.println();
		System.out.printf("%c", 'a');
		System.out.println();
		System.out.printf("%s", "aaaaaa");
		
		System.out.println();
		System.out.printf("%.0f", 10.12345);
	}

}

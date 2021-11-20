package C3_조건문_기본이론_2;

public class C3_기본이론2_변수의생명주기2 {
	/*
	 * 
	 * 중괄호로 소멸된 변수는 다시 선언할 수 있다.
	 * 
	 * */

	public static void main(String[] args) {
		
		int a = 10;

		{
			int b = 20;
		}
		int b = 30; // b는 소멸했으므로 다시만들수있다.

		System.out.println(b);
	}

}

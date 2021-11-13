package B1_변수_기본이론;

public class B1_기본이론2_대입연산자 {

	/*
	 * 		[대입 연산자] =
	 * 		변수는 오직 대입 연산자를 통해서만이
	 * 		값의 변경이 가능하다.
	 * 
	 * 		변수의 값을 변경할때 사용한다.
	 * 		변수는 한개의 값만 저장할 수 있다.
	 * 		새로운 값이 저장되면 그 전의 값은 지워진다.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a= 20;
		System.out.println(a);
		
		int b = 10;
		System.out.println(b + 1); // b가 11이 된 건 아니다.
		System.out.println(b); 
		b = b + 1;
		System.out.println(b);
		
	}

}

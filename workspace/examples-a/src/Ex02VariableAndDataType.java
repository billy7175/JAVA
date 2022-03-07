
public class Ex02VariableAndDataType {

	public static void main(String[] args) {
		
		//1. 변수 선언
		int i; //4byte 정수형 변수 만들기
		double d; //8byte 실수형 변수 만들기
		
		//2. 변수 사용
		i = 10;		//i로 이름붙인 메모리 공간에 데이터 저장
		d = 11.11;	//d로 이름붙인 메모리 공간에 데이터 저장
		
		int i2 = i + i; //데이터 읽기, 초기화(변수 선언 + 데이터 저장)
		System.out.println(i2); //데이터 읽기
		System.out.println(d); //데이터 읽기
		
		//정수형 변수 x를 만들고 100을 저장한 후 
		//x변수에 저장된 값에 50을 곱해서 x2에 저장하고
		//결과를 출력하세요
		
		//2-1. 변수 사용 범위
		int xs = 10;
		{
			xs = 20;
			int ys = 30;
		}
		// ys = 40; // 오류 : 선언된 영역 외부에서 변수 사용할 수 없습니다.
		
		System.out.println("==================================");
		
		
		//3. boolean(논리형) 자료형 사용 
		//   (참-true, 거짓-false 두 개의 데이터만 사용하는 자료형)
		boolean b = true;
		System.out.println(b); //true 출력
		b = false;
		System.out.println(b); //false 출력
		//b = 10;//오류 : 다른 데이터 저장 불가능
		
		//4. 문자/문자열 자료형 사용
		//   ( 문자 : 'A', 문자열 : "ABC" )
		char c = 'A'; //문자
		System.out.println(c); // A 출력
		System.out.println( (int)c ); // 65 출력, (자료형)변수 -> 변수를 지정된 자료형을 사용 
		
		String s = "ABC"; //문자열
		System.out.println(s);
		
		System.out.println("-------------------------------");
		
		//5. 기본값(초기값)
		
		int x;
		// System.out.println(x); //오류 - 값을 저장하지 않은 변수 사용 X
		x = 10;
		System.out.println(x);
		
		//6. overflow, underflow
		int max = 2147483647;//int 자료형으로 표현할 수 있는 최대값
		System.out.println(max);
		max = max + 1; //표현범위를 넘어서는 데이터 처리?
		System.out.println(max);
		
		//7. 형변환 ( 데이터의 형변환 / 변수의 형변환 X )
		int x2 = 10;
		double d2 = x2; // 암시적(묵시적) 형변환 int -> double
		double d3 = 11.11;
		int x3 = (int)d3; // 명시적 형변환 double -> int
		System.out.println(d2);
		System.out.println(x3);
		System.out.println(d3); //형변환 이후 원래 변수의 자료형?
		
				
		
		
		

	}

}








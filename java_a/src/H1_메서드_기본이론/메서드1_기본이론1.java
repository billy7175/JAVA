package H1_메서드_기본이론;

//매서드 기본구조 
// 정의
// 1) void 				==> 키워드
// 2) testPrint() 		==> 이름
// 3) {기능}             ==> 실행되는 영역 
	
// 사용법
// t1.testPrint();
// 1) t1     ==> 클래스변수명
// 2) .testPrint(); ==> .함수이름();
class Test{	
	int a;
	
	void testPrint() {
		System.out.println("!!");
	}
}
public class 메서드1_기본이론1 {
	
	public static void main(String[] args) {
		Test test = new Test();
		test.a = 10;
		test.testPrint();
		test.testPrint();
		test.testPrint();
		test.testPrint();
	}
}

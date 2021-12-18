package H6_메서드리턴1_기본이론;

class TestReturn2_1{
	int result;
	void plus(int a , int b) {
		result = a + b;
	}	
}

class TestReturn2_2{
	int plus(int a , int b) {
		// result 변수가 없어도 기능을 만들수있다. 
		return a + b;
	}
}
public class 메서드리턴1_기본이론2 {
	// 리턴의 사용방법  (2)	
	// return 매서드를 사용하면 클래스내의 변수한개를 줄일수있다.
	// 굳이 쓰지않아도 프로그램 만드는데는 아무런지장이 없다. 
	// 하지만 프로그래밍이 능숙해지면 자연히쓰게된다.

	// 리턴메서드 만드는법 
	// 1) int 					   ==> main 으로 보낼 자료형 
	// 2) plus(int a , int b)     ==> 이름 
	// 3) { return + 내보낼 값 }      ==> 이값은 main 으로 보내진다.   
	
	public static void main(String[] args) {
		TestReturn2_1 t1 = new TestReturn2_1();
		t1.plus(10, 3);
		int num1 = t1.result;
		System.out.println(num1);
		
		System.out.println("---------------------------");
		TestReturn2_2 t2 = new TestReturn2_2();
		int num2 = t2.plus(10, 3);
		System.out.println(num2);
				
	}
}

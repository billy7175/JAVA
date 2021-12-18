package H1_메서드_기본이론;

import java.util.Arrays;

class MyTest{
	int a; // 인스턴스변수 ==> (heap 에 있는변수)
	String name;
	int score;
	void test() {
		// 지역변수 : (stack 에 있는 변수) 
		int a = 10; // test()안의 "a"와  함수밖에있는 a 는 서로 다른a 이다.
		// 색깔로 구분가능하다. 갈색과 파란색 
		// 서로를 구분짓기 위해서는 this.를 붙여야한다. 	
		// 원래 클래스 함수밖에 있는 변수들(인스턴스변수)들은 this.를 붙이는게 원칙이지만
		// 생략가능하다만 명확성을 위해 붙이는게 좋다.
		this.a = 100;
		a = 100;
		System.out.println("------------------");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println("------------------");
		
		this.name = "aaa";
		this.score = 100;
	}
}


public class 메서드1_기본이론8_this {

	public static void main(String[] args) {
		
		
		MyTest t = new MyTest();
		t.test();
		System.out.println(t.a);
	}
}

package G1_클래스_기본이론;

import java.util.Random;

class Test02 {
	String name;
	int score;
}
public class 클래스1_기본이론1_클래스2 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
		Test01 e = new Test01();
		e.x = 10;
		e.y = 20;
	
		System.out.println("--[여러가지자료형을 한클래스에 포함가능하다]--");
		Test02 hgd = new Test02();
		hgd.name = "홍길동";
		hgd.score = 100;

		System.out.println(hgd.name + " " + hgd.score);

		

	}
}

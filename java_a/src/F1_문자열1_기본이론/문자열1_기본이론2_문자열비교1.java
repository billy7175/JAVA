package F1_문자열1_기본이론;
import java.util.Scanner;

public class 문자열1_기본이론2_문자열비교1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "홍길동";

		System.out.print("이름을 입력하세요 : ");
		String myName = scan.next();
		
		if(name == myName) {
			System.out.println("== 연산자 : 일치");
		}else {
			System.out.println("== 연산자 : 불일치");
		}
		
		if(name.equals(myName)) {
			System.out.println("equals() 메서드 : 일치");
		}else {
			System.out.println("equals() 메서드 : 불일치");
		}
		
		if(!name.equals(myName)) {
			System.out.println("equals() 메서드 : 일치222");
		}else {
			System.out.println("equals() 메서드 : 불일치222");
		}
		
		
		
		scan.close();

	}

}

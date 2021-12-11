package F1_문자열1_기본이론;
import java.util.Scanner;

public class 문자열1_기본이론9_문자열입력2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력1 : ");		
		
		String data = scan.next(); // scan.next ==> space 인식불가 
		
		scan.nextLine(); // next 뒤에 nextLine 을사용할경우 enter 값을 저장할 nextLine을 한번더 적어준다.
		
		System.out.println(data);       		
		System.out.println("입력2 : ");	
		String data2 = scan.nextLine(); //scan.nextLine ==> space 인식 
		System.out.println(data2);
		
		// 1) next 와 nextLine 을 동시에 사용하면 엔터가 먹힌는 경우가 발생된다.
		// 2) 그럴경우 next 뒤에 아무내용없는 nextLine을 하나 적어준다. 
		
		scan.close();
	}

}

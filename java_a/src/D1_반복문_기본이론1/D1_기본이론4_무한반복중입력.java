package D1_반복문_기본이론1;
import java.util.Scanner;

public class D1_기본이론4_무한반복중입력 {
	/*
	 [반복문 종료]
	  [1] 무한 반복을 하면서 숫자를 입력받는다.
	  [2] 입력한 숫자가 -100이면, 프로그램은 종료된다.
	  [예]
		  숫자 입력[EXIT:-100] : 1
		  숫자 입력[EXIT:-100] : 3
		  숫자 입력[EXIT:-100] : 4
		  숫자 입력[EXIT:-100] : -100
	  [프로그램 종료]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run == true) {  // run == true 는 run 으로 축약된다.
			System.out.println("숫자입력[EXIT:-100] : ");
			int num = scan.nextInt();
			if(num == -100) {
				System.out.println("프로그램종료");
				run = false;
			}else {
				System.out.println(num);
			}			
		}
		
		scan.close();

	}

}

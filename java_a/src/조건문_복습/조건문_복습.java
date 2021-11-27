package 조건문_복습;
import java.util.Scanner;

public class 조건문_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer = 8;
		int myNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		myNumber = scan.nextInt();
		System.out.println("입력한 숫자 : " + myNumber);
		if(myNumber < computer) {
			System.out.println("Up!");
		} else if (myNumber == computer) {
			System.out.println("Bing Go");
		} else {
			System.out.println("Down");
		}
		
	}

}

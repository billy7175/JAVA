package D5_반복문_기본이론2;
import java.util.Scanner;

public class D5_기본이론3_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int run = 1;
		while (run == 1) {
			System.out.println("1.햄버거");
			System.out.println("2.콜라");
			System.out.println("3.감자");

			int sel = scan.nextInt();

			if (sel != 1 && sel != 2 && sel != 3) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}			
			if (sel == 1) {
				System.out.println("햄버거");
			} else if (sel == 2) {
				System.out.println("콜라");
			} else if (sel == 3) {
				System.out.println("감자");
			}
		}
	}

}

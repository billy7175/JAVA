package E5_배열5_기본이론4;
import java.util.Scanner;

public class 배열5_기본이론2_ui개선 {

	public static void main(String[] args) {
		int arr[] = { 10, 32, 11, 56, 7 };
		int player = 2;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int select = 0;
		while (run) {

			System.out.println("[숫자 전부 지우기]");
			for (int i = 0; i < arr.length; i++) {
				
				System.out.printf("[%2d]", arr[i]);
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				if (i == player) {
					System.out.print("[ ↑]");
				} else {
					System.out.print("[  ]");
				}
			}
			System.out.println();
			System.out.println("1) left 2) right 3)choice");
			select = scan.nextInt();
			if (select == 1 && player > 0) {
				player -= 1;
			} else if (select == 2 && player < arr.length - 1) {
				player += 1;
			} else if (select == 3) {
				arr[player] = 0;
				run = false;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != 0) {
						run = true;
						break;
					}
				}
			}
		}
		System.out.println("[숫자 전부 지우기]");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);
		}
		scan.close();
	}

}

package D7_반복문_알고리즘_LV3;
import java.util.Scanner;

public class D7_로그아웃_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;
		
		int log = -1; // -1(로그아웃), 1111(id1), 2222(id2)
		
		boolean run = true;
		while(run == true) {
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("0. 종료");
			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log == -1) {
					System.out.println("아이디를 입력 : ");
					int userId = scan.nextInt();
					System.out.println("비밀번호를 입력 : ");
					int userPwd = scan.nextInt();
					if(id1 == userId && pw1 == userPwd) {
						log = id1;
						System.out.println(log + "님 로그인 성공");
					} else if (id2 == userId && pw2 == userPwd) {
						log = id2;
						System.out.println(log + "님 로그인 성공");
					} else {
						System.out.println("현재 " + log +" 로 이미 로그인 중입니다.");
					}
				}
			} else if (sel == 2) {
				if(log != -1) {
					log = -1;
				} else {
					System.out.println("로그인 상태에서 가능한 기능입니다.");
				}
			} else { // 0일떄
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}

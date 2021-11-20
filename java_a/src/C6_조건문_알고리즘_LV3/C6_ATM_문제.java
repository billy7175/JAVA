package C6_조건문_알고리즘_LV3;
import java.util.Scanner;
public class C6_ATM_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int adminId = 1234;
		int adminPw = 1234;
		int balance = 1000;
		int cash = 100000;
		int loginId;
		int loginPw;
		System.out.println("----- A T M -----");
		System.out.println("아이디를 입력해주세요 :");
		loginId = scan.nextInt();
		System.out.println("비밀번호를 입력해주세요 :");
		loginPw = scan.nextInt();
		
		if(adminId == loginId && adminPw == loginPw) {
			System.out.println("로그인을 성공했습니다");
			
			System.out.println("원하시는 거래의 번호를 선택해주세요.");
			System.out.println("[1. 입금] [2. 출금]");
			
			int select2 = scan.nextInt();
			if(select2 == 1) {
				System.out.println("[입금] 금액 입력 : ");
				int money = scan.nextInt();
				cash -= money;
				balance += money;
				System.out.println("남은 현금 : "+ cash);
				System.out.println("통장 잔고 : " + balance);
			} else if(select2 == 2){
				System.out.println("[출금] 금액 입력 : ");
				int money = scan.nextInt();
				cash += money;
				balance -= money;
				System.out.println("남은 현금 : "+ cash);
				System.out.println("통장 잔고 : " + balance);
			}
		} else {
			System.out.println("로그인을 실패했습니다");
		}
		
		scan.close();

	}

}

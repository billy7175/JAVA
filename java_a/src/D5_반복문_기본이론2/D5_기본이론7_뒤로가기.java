package D5_반복문_기본이론2;
import java.util.Scanner;

public class D5_기본이론7_뒤로가기 {
	/*
	 * [뒤로가기]
	 *      쇼핑몰메인메뉴에서 남성의류를 선택후
	 *      뒤로가기 누르기전까지 남성의류 페이지를 유지할려고한다.
	 * 		
	 * 1. 남성의류
	 * 		1) 티셔츠
	 * 		2) 바지
	 * 		3) 뒤로가기
	 * 2. 여성의류
	 * 		1) 가디건
	 * 		2) 치마
	 * 		3) 뒤로가기
	 * 3. 종료
	 * 
	 * 
	 * [여성의류도 남성의류와 마찬가지로 뒤로가기를 구현해보세요]
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		boolean run = true;
		while(run) {
			System.out.println("=== 그린 쇼핑몰 ===");
			System.out.println("[1] 여성의류 [2] 남성의류 [0] 프로그램 종료" );
			int sel = scan.nextInt();	
			if(sel == 1) {
				boolean run2= true;
				while(run2) {
					System.out.println("=== 여성 의류 === ");
					System.out.println("[1] 티셔츠 [2] 치마 [3] 바지 [0] 뒤로가기");
					int sel2 = scan.nextInt();
					if(sel2 ==1) {
						System.out.println("티셔츠");
					}
					else if(sel2 ==2) {
						System.out.println("치마");
					} else if (sel2 == 3) {
						System.out.println("바치");
					} else {
						run2 = false;
					}
				}
				
			}
			else if(sel == 2) {
				boolean run2= true;
				while(run2) {
					System.out.println("=== 남성 의류 ===");
					System.out.println("[1] 남성 티셔츠 [2] 남성 치마 [3] 남성 바지 [0] 뒤로가기");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("남성 티셔츠");
					}
					if(sel2 == 2) {
						System.out.println("남성 치마");
					}
					if(sel2 == 3) {
						System.out.println("남성 바지");
					} else {
						run2 = false;
					}
				}
	
			}
			else if(sel == 0) {				
				System.out.println("프로그램 종료");
				run = false;
			}
			
		}

	}

}

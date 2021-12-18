package H1_메서드1_알고리즘;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스[변수]
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 */

/*
class BurgerShop{
	
	Scanner scan = new Scanner(System.in);

	String name = "";		// 가게 이름
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	int[] arCount = new int[4];
	int total = 0;	
}
*/

public class 메서드1_알고리즘_영수증_문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BurgerShop moms = new BurgerShop();
		moms.name = "맘츠터치 햄버거";
		
		while(true) {
			
			// 메뉴 선택
			System.out.print("메뉴를 선택하세요 : ");
			int choice = scan.nextInt();
			
			
		}		
		
	}
}
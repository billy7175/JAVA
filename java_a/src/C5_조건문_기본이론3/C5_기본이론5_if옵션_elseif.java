package C5_조건문_기본이론3;
import java.util.Scanner;

public class C5_기본이론5_if옵션_elseif {
/*
 * 
 * 
 * */
	public static void main(String[] args) {
		System.out.println("자판기 : [1.과자 2.음료수 3.라면]");
		System.out.println("번호를 골라주세요.3");
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		if(select == 1) { 
			System.out.println("1.과자");
		} else if(select == 2) { 
			System.out.println("2.음료수");
		} else if(select == 3) { 
			System.out.println("3.라면");
		} else  {
			System.out.println("오류");
		}
		scan.close();
	}

}

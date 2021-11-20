package C5_조건문_기본이론3;
import java.util.Scanner;
public class C5_기본이론6_elseif활용 {
/*
 * 가위바위보 게임을 IF - ELSE IF 구문으로 변경해보자
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] 가우바위봄
		// P1과 P2에 가위(1) 바위(2) 보(3)을 입력받고 결과출력
		Scanner scan = new Scanner(System.in);
		
		int p1;
		int p2;
		System.out.println("가위(1) 바위(2) 보(3)");
		System.out.println("p1의 값을 골라주세요");
		p1 = scan.nextInt();
		System.out.println("p1 선수의 값 = "+ p1 );
		System.out.println("p2의 값을 골라주세요.");
		p2= scan.nextInt();
		System.out.println("p2 선수의 값" + p2 );
		//p1이 이기는 경우
		
		if(p1 == p2 ) {
			System.out.println("무숭부");
		} else {
			// p1이 이기는 경우
			if((p1 == 1 && p2 ==3) || ((p1 == 2 && p2 == 1)) || ((p1 == 3 && p2 == 2 ))) {
				System.out.println("p1 승리 ");
			} else {
				System.out.println("p2 승리");
			}
//			if(p1 == 2 && p2 == 1) {
//				System.out.println("p1 승리 ");
//			}
//			if(p1 == 3 && p2 == 2 ) {
//				System.out.println("p1 승리 ");
//			}
			
			// P2가 이기는 경우
//			if(p1 == 2 && p2 ==3) {
//				System.out.println("p2 승리 ");
//			}
//			if(p1 == 3 && p2 == 1) {
//				System.out.println("p2 승리 ");
//			}
//			if(p1 == 1 && p2 == 2 ) {
//				System.out.println("p2 승리 ");
//			}
		}
		
		scan.close();
		//[2] 가장 큰 수 찾기;
		// a, b, c 에 랜덤으로 1 ~ 100을 저장 후 가장 큰 수를 출력하세요.;
 	}

}

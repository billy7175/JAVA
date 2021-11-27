package 조건문_복습;
import java.util.Scanner;
public class 조건문_복습_최대값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int first;
		int second;
		int third;
		int answer = 0;
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.println("첫번째 숫자를 입력해주세요");
		first = scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요.");
		second = scan.nextInt();
		System.out.println("세번째 숫자를 입력해주세요.");
		third = scan.nextInt();
		if(first > second) {
			answer = first;
		}
		if(first > third) {
			answer = first;
		}
		if(second > first) {
			answer = second;
		}
		if(second > third) {
			answer = second;
		}
		if(third > first){
			answer = third;
		}
		if(third > second) {
			answer = third;
		}
		System.out.println("가장 큰 수는 : " + answer);
	}
}

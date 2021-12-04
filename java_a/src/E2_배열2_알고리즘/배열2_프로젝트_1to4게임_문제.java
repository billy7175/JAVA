package E2_배열2_알고리즘;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class 배열2_프로젝트_1to4게임_문제 {
	/*
	 * [문제]
	 * 
	 * [1to4 게임]
	 * 
	 * [1] arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
	 * [2] 사용자는 가장작은수1부터 순서대로 해당 방번호(인덱스)을 입력한다.
	 * [3] 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
	 * 
	 * [예]
	 * 
	 * 시작 : { 4 2 3 1 }
	 * 
	 * 인덱스 입력 : 3  ==> { 4 2 3 9 } ==> 1은 가장작은수이므로 9로 변경한다.
	 * 
	 * 인덱스 입력 : 0 ==>  { 4 2 3 9 }  ==> 4는 가장작은수가아니므로 변화가없다.
     *
     * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[4];
		boolean check[] = new boolean[4];
		Random random = new Random();
		
		
		for(int i= 0; i < arr.length;) {
			int r = random.nextInt(4);
			System.out.print ("i :"+ i);
			System.out.println(" r :" +r);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r;
				i += 1;
			}
		}
		for(int i=0; i<4; i++) {
			arr[i] += 1;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------");
		
		
		int count = 1;
		boolean run = true;
		while(run) {
			System.out.println(Arrays.toString(arr));
			if(count >4) {
				run = false;
			}
			System.out.println("가장 작은 숫자의 위치(0~3)을 선택하세요.");
			int sel = scanner.nextInt();
			System.out.println("가장 작은 수를 예상해주세요");
			if(arr[sel] == count) {
				count += 1;
				arr[sel] = 9;
			}
			
		}
	}

}

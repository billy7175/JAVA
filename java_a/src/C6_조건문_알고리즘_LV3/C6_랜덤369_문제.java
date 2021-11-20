package C6_조건문_알고리즘_LV3;
import java.util.Random;
public class C6_랜덤369_문제 {
	/*
	   [369게임]
	  
	   [1] 1~50 사이의 랜덤 숫자를 저장한다.
	   [2-1] 랜덤숫자중에서 3이나 6이나 9의 개수가  2개면, 짝짝을 출력한다.
	   [2-2] 랜덤숫자중에서 3이나 6이나 9의 개수가  1개면, 짝을 출력한다.
	   [2-3] 0개이면, 해당 숫자를 출력한다.
	   (예)
	   		33	==> 짝짝
	   		16	==> 짝
	   		 7	==> 7
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomNum = random.nextInt(50)+1;
		System.out.println("무작위 숫자 : " + randomNum);
		
	}

}

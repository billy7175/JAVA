package D2_반복문_기본문제1;

public class D2_기본문제5_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 [문제] 1~5까지의 합을 출력하시오.  1 + 2 + 3 + 4 + 5
		 [정답] 15
	
	*/
		int i = 1;
		int total = 0;
		while(i <= 5){
//			System.out.println(i);
			total = total + i;
			System.out.println("total"+ total);
			i = i + 1;
			System.out.println("i" + i);
		}
	}

}

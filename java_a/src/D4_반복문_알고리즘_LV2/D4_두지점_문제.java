package D4_반복문_알고리즘_LV2;

public class D4_두지점_문제 {
	/*
	  [문제]
		철수네 가족은 x 와 y 두지점을 자전거를 타고 왕복하였다. 
		갈때는 시속15km , 올때는 시속12km 로 이동하여 총  45분이 걸렸을때 , 
		두지점의 x , y 거리를 구하시오.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double 갈때분속 = 15/60.0;
		double 올때분속 = 12/60.0;
		
		int a = 45;
		int b = 0;
		
		// 갈떄분속 * a 분 + 올때분속 * b ( a +  b == 45)
		
		boolean run = true;
		while(run == true) {
			if(갈때분속 * a == 올때분속 * b ) {
				System.out.println(a + "분 / " +b + "분");
				run = false;
			}
			a -= 1;
			b += 1;
		}
	}

}

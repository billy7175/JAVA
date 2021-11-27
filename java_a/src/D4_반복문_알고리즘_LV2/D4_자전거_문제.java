package D4_반복문_알고리즘_LV2;

public class D4_자전거_문제 {
	/*
	 * [문제]
		학교에서 집까지 갈때 시속 15km로 자전거를 타고 가면, 
		시속 6km로 걸어가는거보다 18분 빨리 도착한다고 한다.
		학교에서 집까지의 거리를 구하시오.
	 */

	public static void main(String[] args) {
//		double 자전거 = 15 / 60.0;
//		double 걷기 = 6 / 60.0;
//		int a = 0;
//		boolean run = true;
//		while(run) {
//			if(a * 자전거 == 걷기 + 18 *걷기) {
//				System.out.println(a + "" + a* 자전거 );
//				run = false;
//			} else {
//				a += 1;
//			}
//		}
		double 자전거 = 15/60.0;
		double 걷기 = 6/60.0;	
		int a = 0;
		boolean run = true;
		while(run) {
//			if(a * 자전거 == a * 걷기 + 18 * 걷기) {
			if(a * 자전거 == a * 걷기 + 걷기 * 18) {
				System.out.println(a + " " + a * 자전거);
				System.out.println(a + "분" + "거리" + (자전거 * a));
				run = false;
			}else {
				a += 1;
			}
			
		}
		
	}

}

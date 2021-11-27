package 조건문_복습;

import java.util.Random;

public class 조건문_복습_요일맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int day = ran.nextInt(31) + 1;
		int week = day % 7;
		if(week == 1) {
			System.out.println("수요일");
		}
		if(week == 2) {
			System.out.println("목요일");
		}
		if(week == 3) {
			System.out.println("금요일");
		}
		if(week == 4) {
			System.out.println("토요일");
		}
		if(week == 5) {
			System.out.println("일요일");
		}
		if(week == 6) {
			System.out.println("월요일");
		}
		if(week == 0) {
			System.out.println("화요일");
		}
	
	}

}

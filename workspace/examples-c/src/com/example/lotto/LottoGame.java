package com.example.lotto;

import java.util.Scanner;

public class LottoGame {
	
	private Scanner scanner = new Scanner(System.in);
	/**
	 * 
	 * @return
	 */
	private String selectMenu() {
//		java.util.Scanner scanner = new java.util.Scanner(System.in); // 입력기 생성
		System.out.println("****************");
		System.out.println("1. 당첨 예상 번호 뽑기.");
		System.out.println("2. 종류");
		System.out.println("****************");
		System.out.println("작업을 선택하세요 : ");
		String selection = scanner.nextLine(); // 사용자 입력을 문자ㅕㄹ(0개 이상의 문자 집합)로 변환
		System.out.println("Your selection is "+ selection);
		return selection;
	}
	
	
	/**
	 * 
	 * @param numbers
	 */
	private void showNumbers(int[] numbers) {
		System.out.println("당첨 예상 번호 :");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(i);
			System.out.println("[" +numbers[i] +"]");
		}
	}
	
	public void doGame() {
		Lottol lotto = new Lotto ();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LottoGame game = new LottoGame();
		game.doGame();

	}

}

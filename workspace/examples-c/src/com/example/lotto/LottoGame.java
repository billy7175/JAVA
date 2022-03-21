package com.example.lotto;

import java.util.Scanner;

public class LottoGame {
	
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * 사용자에게 선택할 수 있는 작업목록을 표시하고<br>
	 * 사용자의 선택을 받아서 반환하는 메서드
	 * @return 사용자가 선택한 작업 번호
	 */
	private String selectMenu() {
		System.out.println("******************************");
		System.out.println("* 1. 당첨 예상 번호 뽑기.");
		System.out.println("* 2. 종료.");
		System.out.println("******************************");

		System.out.print("작업을 선택하세요 : ");
		String selection = scanner.nextLine(); // 사용자 입력을 문자열(0개 이상의 문자 집합)로 반환
		// System.out.println("your selection is " + selection); // 문자열 + 문자열 -> 문자열 결합
		return selection;
	}
	
	private void showNumbers(int[] numbers) {
		System.out.print("당첨 예상 번호 : ");
		for(int i = 0; i < numbers.length; i++) { // i++ : i = i + 1
			System.out.print("[" + numbers[i] + "]");
		}
		System.out.println();
	}
	
	public void doGame() {
		Lotto lotto = new Lotto();
		while (true) {
			
			String selection = selectMenu();
			
			if (selection.equals("1")) {
				
				int[] numbers = lotto.selectWinningNumbers();				
				showNumbers(numbers);
				
			} else if (selection.equals("2")) {
				System.out.println("행운을 빕니다 !!!!!");
				System.out.println("프로그램을 종료합니다.");
				break; // while 반복문 종료
			} else { // 비정상 입력
				System.out.println("지원하지 않는 명령입니다. ");
			}
		}
	}

	public static void main(String[] args) {
		LottoGame game = new LottoGame();
		game.doGame();
	}

}

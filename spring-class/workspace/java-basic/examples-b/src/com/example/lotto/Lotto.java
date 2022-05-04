package com.example.lotto;

/**
 * 로또 당첨 예상 번호 뽑기 클래스
 * @author Administrator
 *
 */
public class Lotto {
	
	private int[] selectBasicNumbers() {
		// int[] numbers; // 배열 참조변수 만들기
		// numbers = new int[6]; // 정수 6개를 저장할 수 있는 배열 인스턴스 만들고 주소를 저장
		int[] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) { // 중복 검사를 위한 반복문
				if (numbers[i] == numbers[j]) { // 중복된 데이터 발견된다면
					//i = -1;
					i--; // i -= 1, --i, i = i - 1
					break;
				}
			}
		}
		return numbers;
	}
	
	private boolean checkAverage(int[] numbers, int from, int to) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; // sum = sum + number;
		}
		int mean = sum / numbers.length;
		
		return mean >= from && mean < to;
	}
	
	
	public int[] selectWinningNumbers() {
		int[] numbers = null;
		boolean valid = false;
		
		do {
			numbers = selectBasicNumbers();
			valid = checkAverage(numbers, 20, 26);
		} while (valid == false);
		
		return numbers;
	}
	

}









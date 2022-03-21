package com.example.lotto;
/**
 * 
 * 로또 당첨 예상 번호 뽑기 클래스
 * @author Administrator
 *
 */
public class Lotto {
	// satic을 다 할거면 CLASS 왜 함
	// static method 안에서는 static 변수만
	// numbers = new int[6]
	private int[] selectBasicNumbers() {
		int [] numbers = new int[6]; // 정수 6개를 저장할 수 있는 배열 인스턴 만들고 주소를 저장
		for(int i =0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 45)+1;
			for(int j=0; j < i; j++) {
				if(numbers[i] == numbers[j]) { // 중복된 데이터가 발견된다면
					// i = -1 을 넣음으로써 초기화를 시킬 수 있음;
					i--; // i-=1, --i, i= i-1;
					break;
				}
			}
		}
		return numbers;
	}
	
	private boolean checkAverage (int[] numbers, int from, int to) {
		int sum = 0;
		// 인헨스드 for 문 ?
		for(int number : numbers) {
			sum += number;
		}
		
		// 앞은 포함 뒤는 안 포함 관행이다;
		int mean = sum / numbers.length;
		return mean >= from && mean < to;
	}
	
	public int[] selectWinningNumber () {
		int[] numbers = null;
		boolean valid = false;
		//실행 결과의 경우 do while 문
		
		do {
			 numbers = selectBasicNumbers();
			 valid = checkAverage(numbers,20, 26);
		} while(valid == false);
		
		return numbers;
		
	}

}

package E3_�迭3_�˰���;

import java.util.Arrays;

public class �迭3_�˰���_���� {

	public static void main(String[] args) {
		int [] score = { 10, 50, 30, 40, 80, 19,2 }; // 10 ~80;
		
		for(int i=0; i < score.length; i++) {
			int max = score[i];
			int index = i;
			for(int j = i+1; j < score.length; j++) {
				if(max < score[j]) {
					max = score[j];
					index = j;
				}
			}
			int temp = score[i];
			score[i] = score[index];
			score[index] = temp;
		}
		
		System.out.println(Arrays.toString(score));
		
//		
//		System.out.println(Arrays.toString(score));
		
		//�� /2?
//		Arrays.sort(score);
//		
//		int last = score.length-1;
//		for(int i=0; i < score.length/2; i++) {
//			int temp = score[i];
//			score[i] = score[last];
//			score[last] =temp;
//			last -= 1;
//		}
//		System.out.println(score.length/2);
//		System.out.println(Arrays.toString(score));
		

	}

}

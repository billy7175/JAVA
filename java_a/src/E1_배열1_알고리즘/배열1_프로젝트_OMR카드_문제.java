package E1_�迭1_�˰���;
import java.util.Arrays;
import java.util.Random;

public class �迭1_������Ʈ_OMRī��_���� {
	/*
	 * [OMRī��]
	 * 
	 * 1. �迭 test�� ���蹮���� �������̴�.
	 * 2. �迭 student�� 1~5 ������ ���� ���� 5���� �����Ѵ�.	
	 * 3. ���ڸ����� ���ؼ� ������ ����Ѵ�.
	   4. ������ �� ������ 20���̴�.
	   5. ������ ����Ѵ�.  
	   
	 * [��]
	 * test  = {1, 3, 4, 2, 5}
	 * student = {1, 1, 4, 4, 3}
	*/
	public static void main(String[] args) {
		Random scan = new Random();
		int test[] = {5,5,5,5,5};
		int student[] = new int[5];
		int score = 0;
		for(int i=0; i < 5; i++) {
			student[i] = scan.nextInt(5) + 1;
		}
		System.out.println(Arrays.toString(student));
		
		for(int i=0; i<test.length; i++) {
			if(test[i] == student[i]) {
				score += 20;
				System.out.println("����");
			} else {
				System.out.println("����");
						
			}
			
			System.out.println();
		}
		
		
	}

}

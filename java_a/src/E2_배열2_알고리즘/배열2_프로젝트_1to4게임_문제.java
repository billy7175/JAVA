package E2_�迭2_�˰���;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class �迭2_������Ʈ_1to4����_���� {
	/*
	 * [����]
	 * 
	 * [1to4 ����]
	 * 
	 * [1] arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
	 * [2] ����ڴ� ����������1���� ������� �ش� ���ȣ(�ε���)�� �Է��Ѵ�.
	 * [3] ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
	 * 
	 * [��]
	 * 
	 * ���� : { 4 2 3 1 }
	 * 
	 * �ε��� �Է� : 3  ==> { 4 2 3 9 } ==> 1�� �����������̹Ƿ� 9�� �����Ѵ�.
	 * 
	 * �ε��� �Է� : 0 ==>  { 4 2 3 9 }  ==> 4�� �������������ƴϹǷ� ��ȭ������.
     *
     * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[4];
		boolean check[] = new boolean[4];
		Random random = new Random();
		
		
		for(int i= 0; i < arr.length;) {
			int r = random.nextInt(4);
			System.out.print ("i :"+ i);
			System.out.println(" r :" +r);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r;
				i += 1;
			}
		}
		for(int i=0; i<4; i++) {
			arr[i] += 1;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------");
		
		
		int count = 1;
		boolean run = true;
		while(run) {
			System.out.println(Arrays.toString(arr));
			if(count >4) {
				run = false;
			}
			System.out.println("���� ���� ������ ��ġ(0~3)�� �����ϼ���.");
			int sel = scanner.nextInt();
			System.out.println("���� ���� ���� �������ּ���");
			if(arr[sel] == count) {
				count += 1;
				arr[sel] = 9;
			}
			
		}
	}

}

package C6_���ǹ�_�˰���_LV3;
import java.util.Scanner;
import java.util.Random;
public class C6_���ǹ�_�˰���_LV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(10)+1;
//		int yourAnswer;
		System.out.println("����� ���� : " + randomNumber);
		System.out.println("Ȧ�� ¦�� �� �ϳ��� ��� ��ȣ�� �Է����ּ���.");
		System.out.println("[1] Ȧ��, [2] ¦��");
		int select = scan.nextInt();
		if(select == 1) {
			if(randomNumber % 2 == 0) {
				System.out.println("����, ¦���Դϴ�");
			} else {
				System.out.println("����, Ȧ���Դϴ�.");
			}
		} else if( select == 2 ){
			if(randomNumber % 2 == 0) {
				System.out.println("����, ¦���Դϴ�");
			} else {
				System.out.println("����, Ȧ���Դϴ�.");
			}
		} else {
			System.out.println("�ùٸ� ��ȣ�� �Է����ּ���.");
		}
		scan.close();
	}

}

package memberTest;
import java.util.Scanner;

public class memberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		memberDAO member = new memberDAO();
		while(true) {
			System.out.println("ȸ������");
			System.out.println("[1]�߰� [2]���� [3]���� [4] �˻� [5] ���");
			int sel = scan.nextInt();
			if(sel == 1) {
				member.insert();
			} else if (sel ==2) {
				member.delete();
			} else if(sel == 3) {
				member.update();
			} else if(sel == 4) {
				member.read();
			} else if (sel == 5) {
				member.print();
			}
		}
	}

}

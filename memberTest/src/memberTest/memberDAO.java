package memberTest;
import java.util.Arrays;
import java.util.Scanner;


// Data Access Object;
// �迭 ó��;
public class memberDAO {

	// 100�� ,��ȣ, ���̵�, ��й�ȣ, �̸�
	String [][] memberList = new String[100][4];
	int count =0;
		Scanner scan = new Scanner(System.in);
	
	int lastNumber = 10001;
	void insert() {
		String [] data = new String[4];
		data[0] = lastNumber + "";
		System.out.println("�߰��� ���̵��Է�:");
		data[1] = scan.next();
		boolean check = false;
		for(int i =0; i < count; i++) {
			if(data[i].equals(memberList[i][1])) {
				check = true;
				break;
			}
		}
		if(check == false ) {
			System.out.println("��й�ȣ �Է� : ");
			data[2] = scan.next();
			System.out.println("�̸� �Է� :");
			data[3] = scan.next();
			memberList[count] = data;
			count +=1;
			lastNumber += 1;
			System.out.println("�߰� ����");
		} else {
			System.out.println("�ߺ� ���̵�");
		}
		
	}
	void delete() {
		
	}
	void update () {
		
	}
	void read() {
		System.out.println("READ");
	}
	void print() {
		for(int i =0; i< count; i++) {
			System.out.println(Arrays.toString(memberList[i]));
		}
	}
}


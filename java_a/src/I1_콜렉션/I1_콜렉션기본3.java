package I1_�ݷ���;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class I1_�ݷ��Ǳ⺻3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String[]> memberList = new ArrayList<String[]>();
		String [] member1 = {"1001", "qwer1", "asdf1", "��ö��"};
		String [] member2 = {"1002", "qwer2", "asdf2", "�̸���"};
		String [] member3 = {"1003", "qwer3", "asdf3", "������"};
		String [] member4 = {"1004", "qwer4", "asdf4", "������"};
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);
		int last = 1005;
		while(true) {
			System.out.println("[1]�߱� [2]���� [3]���� [4]��� [5]����");
			int sel = scan.nextInt();
			if(sel ==1) {
				String[] temp = new String[4];
				temp[0] = last + "";
				System.out.println("���̵� �Է�");
				temp[1] = scan.next();
				System.out.println("��ֹ�ȣ �Է� : ");
				temp[2] = scan.next();
				System.out.println("�̸� �Է�");
				temp[3] = scan.next();
				memberList.add(temp);
				last+=1;
			} else if(sel ==2) {
				System.out.println("������ ������ �ε����� �Է����ּ���.");
				int deleteIdx = scan.nextInt();
				System.out.println("deleteIdx " + deleteIdx);
				for(int i=0; i <memberList.size(); i++) {
					if(i == deleteIdx) {
						System.out.println(Arrays.toString(memberList.get(i)));
						memberList.remove(i);
					}
				}
				
				System.out.println("���� �� ������");
				for(int i=0; i< memberList.size(); i++) {
					String [] temp = memberList.get(i);
					System.out.println(Arrays.toString(temp));
				}
			}else if(sel ==3) {
				System.out.println("������Ʈ �� �ε����� �Է����ּ���.");
				int updateIdx = scan.nextInt();
				for(int i=0; i <memberList.size(); i++) {
					if(i == updateIdx) {
						String[] updateMember = new String[4]; 
						updateMember[0] =  memberList.get(i)[0]; // ������ �ִ� �ε����� �ִ´�.
						System.out.println("���̵� �Է�"); // ���� ���� �������� �ʰ� �Ϻ� ������ ����� �� �ֵ��� ���� ����!..
						updateMember[1] = scan.next();
						System.out.println("��ֹ�ȣ �Է� : ");
						updateMember[2] = scan.next();
						System.out.println("�̸� �Է�");
						updateMember[3] = scan.next();
						memberList.set(updateIdx, updateMember);
						
					}
				}
				
				
				
				
				for(int i=0; i< memberList.size(); i++) {
					String [] temp = memberList.get(i);
					System.out.println(Arrays.toString(temp));
				}
			
			}else  if(sel == 4) {
				for(int i=0; i< memberList.size(); i++) {
					String [] temp = memberList.get(i);
					System.out.println(Arrays.toString(temp));
				}
			}
			
		}
	}
}

package H4_�޼���4_��ȭ����;
import java.util.Scanner;
/*
	��� ������
	[0] ��ȣ
	[1] ���̵�
	[2] ��й�ȣ
	[3] �̸� 	
 */

/*
	��ȭ���� ����16 * ����10 �������̰� 
	���� 1~5 �� ���ΰ� 16�� �ƴϰ� ��� 10���ִ�.
	
	 
*/
class cinemaDAO{
	int maxSize = 10000;
	String[][] seatList = new String[maxSize][3];
	int ymax = 10;
	int xmax = 16;
		
	void init() {
		
	}
}

class MemberDAO{
	int lastNumber = 10001;
	int maxSize = 10000;
	String[][] memberList = new String[maxSize][4];
	int memberCount = 0;	
	void insertMember(String id , String pw , String name) {
		memberList[memberCount][0] = lastNumber + "";
		memberList[memberCount][1] = id;
		memberList[memberCount][2] = pw;
		memberList[memberCount][3] = name;
		lastNumber += 1;
		memberCount += 1;
	}
	boolean checkId(String id) {
		boolean check = false;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i][1].equals(id)) {
				check = true;
				break;
			}
		}	
		return check;
	}
	boolean checkLogin(String id , String pw) {
		boolean check = false;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i][1].equals(id) && memberList[i][2].equals(pw)) {
				check = true;
				break;
			}
		}	
		return check;
	}
}
class MemberController{
	Scanner scan = new Scanner(System.in);
	MemberDAO memberDAO = null;
	String log = "";
	void init(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}	
	void run() {		
		while(true) {
			System.out.println("=== [�ڵ� �ó׸�] ===");
			System.out.println("[1] ���� [2] �α��� [0] ����");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("���̵� �Է��ϼ��� : ");
				String id = scan.next();
				boolean check = memberDAO.checkId(id);
				if(check == true) {
					System.out.println("�����ϴ� ���̵��Դϴ�.");
				}else {
					System.out.println("����Ҽ��ִ� ���̵��Դϴ�.");
					System.out.println("��й�ȣ�� �Է��ϼ��� : ");
					String pw = scan.next();
					System.out.println("�̸��� �Է��ϼ��� : ");
					String name = scan.next();
					memberDAO.insertMember(id, pw, name);
				}
			}else if(sel == 2) {
				System.out.println("���̵� �Է��ϼ��� : ");
				String id = scan.next();
				System.out.println("��й�ȣ�� �Է��ϼ��� : ");
				String pw = scan.next();
				boolean check = memberDAO.checkLogin(id, pw);
				if(check == true) {
					log = id;
					System.out.println("�α��μ���");					
					while(true) {
						System.out.println("[" + log + "�� �α�����]");
						System.out.println("[1] �α׾ƿ� [2] �������� [3] ��ȭ����");
						int sel2 = scan.nextInt();
						if(sel2 == 1) {
							System.out.println("�α׾ƿ��մϴ�.");
							log = "";
							break;
						}else if(sel2 == 2) {
							
						}else if(sel2 == 3) {
							
						}
					}
				}else {
					System.out.println("�α��ν���");
				}
				
				
			}else if(sel == 0) {
				
			}
		}
	}
}


public class �޼���_��ȭ���� {
	public static void main(String[] args) {
		MemberController controller = new MemberController();
		MemberDAO memberDAO = new MemberDAO();
		controller.init(memberDAO);
		controller.run();
	}
}

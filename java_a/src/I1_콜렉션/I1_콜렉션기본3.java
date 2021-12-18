package I1_콜렉션;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class I1_콜렉션기본3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String[]> memberList = new ArrayList<String[]>();
		String [] member1 = {"1001", "qwer1", "asdf1", "김철수"};
		String [] member2 = {"1002", "qwer2", "asdf2", "이만수"};
		String [] member3 = {"1003", "qwer3", "asdf3", "유정수"};
		String [] member4 = {"1004", "qwer4", "asdf4", "오만수"};
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);
		int last = 1005;
		while(true) {
			System.out.println("[1]추기 [2]삭제 [3]수정 [4]출력 [5]종료");
			int sel = scan.nextInt();
			if(sel ==1) {
				String[] temp = new String[4];
				temp[0] = last + "";
				System.out.println("아이디 입력");
				temp[1] = scan.next();
				System.out.println("비멀번호 입력 : ");
				temp[2] = scan.next();
				System.out.println("이름 입력");
				temp[3] = scan.next();
				memberList.add(temp);
				last+=1;
			} else if(sel ==2) {
				System.out.println("삭제할 정보의 인덱스를 입력해주세요.");
				int deleteIdx = scan.nextInt();
				System.out.println("deleteIdx " + deleteIdx);
				for(int i=0; i <memberList.size(); i++) {
					if(i == deleteIdx) {
						System.out.println(Arrays.toString(memberList.get(i)));
						memberList.remove(i);
					}
				}
				
				System.out.println("삭제 후 데이터");
				for(int i=0; i< memberList.size(); i++) {
					String [] temp = memberList.get(i);
					System.out.println(Arrays.toString(temp));
				}
			}else if(sel ==3) {
				System.out.println("업데이트 할 인덱스를 입력해주세요.");
				int updateIdx = scan.nextInt();
				for(int i=0; i <memberList.size(); i++) {
					if(i == updateIdx) {
						String[] updateMember = new String[4]; 
						updateMember[0] =  memberList.get(i)[0]; // 기존에 있던 인덱스를 넣는다.
						System.out.println("아이디 입력"); // 고유 값은 수정되지 않고 일부 정보만 변경될 수 있도록 만들어도 보자!..
						updateMember[1] = scan.next();
						System.out.println("비멀번호 입력 : ");
						updateMember[2] = scan.next();
						System.out.println("이름 입력");
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

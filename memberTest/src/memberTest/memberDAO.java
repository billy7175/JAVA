package memberTest;
import java.util.Arrays;
import java.util.Scanner;


// Data Access Object;
// 배열 처리;
public class memberDAO {

	// 100명 ,번호, 아이디, 비밀번호, 이름
	String [][] memberList = new String[100][4];
	int count =0;
		Scanner scan = new Scanner(System.in);
	
	int lastNumber = 10001;
	void insert() {
		String [] data = new String[4];
		data[0] = lastNumber + "";
		System.out.println("추가할 아이디입력:");
		data[1] = scan.next();
		boolean check = false;
		for(int i =0; i < count; i++) {
			if(data[i].equals(memberList[i][1])) {
				check = true;
				break;
			}
		}
		if(check == false ) {
			System.out.println("비밀번호 입력 : ");
			data[2] = scan.next();
			System.out.println("이름 입력 :");
			data[3] = scan.next();
			memberList[count] = data;
			count +=1;
			lastNumber += 1;
			System.out.println("추가 성공");
		} else {
			System.out.println("중복 아이디");
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


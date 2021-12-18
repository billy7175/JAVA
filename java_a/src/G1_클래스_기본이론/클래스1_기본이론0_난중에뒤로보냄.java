package G1_클래스_기본이론;
class Member{
	int number;
	String name; 
	String position; 
	int superiorNumber;
	String regDate;
	int salary;
	int commission;
	int departmentNumber;
}
public class 클래스1_기본이론0_난중에뒤로보냄 {
	public static void main(String[] args) {		
		//클래스의 진짜용도 (이번단원은  설명만하고 다음단원에서 진짜로 연습)			
		// 1) 배열만 사용해서 프로그램을 만들때의 불편함 		
		// 2) 아래와 같은 데이터가 있을때 배열만 사용할때는 한배열안에 같은 종류의 자료형만저장가능하다.
		//    - [1] 결국 , 정수같은데이터는 계속 형변환을 사용해야한다. 
		//    - [2] 또한 데이터를 검색할때 employeeData[0][0] , employeeData[0][1] 등
		//		       인덱스로 찾아야하는데 데이터가 많아지면 인덱스로찾기가 불편하다.
		// ----------------------------------------------------------------
		// [사원정보]
		// [번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
		String[][] memberList = { 
				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" }};		
			
		String[] numList = {"7369" , "7499" , "7521"};
		String[] nameList = {"SMITH" , "ALLEN" , "WARD"};
		String[] bossList = {"CLERK" , "SALESMAN" , "SALESMAN"};
		int [] salaryList = { 800 , 1600, 1250};
		
		// 3) 아래와같이 문자열 , 정수 이렇게 섞어서 저장하고싶은 아이디어에서 나옴 
		/*
			{ 7369, "SMITH", "CLERK", 7902, "17-12-1980", 800, 0, 20 }
			{ 7499, "SMITH", "CLERK", 7698, "17-12-1980", 1600, 300, 30 }
			{ 7521, "SMITH", "CLERK", 7698, "17-12-1980", 1250, 500, 30 }
		*/
		// 4) 위데이터를 클래스로 바꾸면 굉장히 직관적으로 데이터를 저장할수있다.
		Member member = new Member();
		member.number = 7369;
		member.name = "SMITH";
		member.position = "CLERK";
		member.superiorNumber = 7902;
		member.regDate = "17-12-1980";
		member.salary = 800;
		member.commission = 0;
		member.departmentNumber = 20;
		
		// 위 클래스를 배열로 만들면 마무리가된다. 
	}
}

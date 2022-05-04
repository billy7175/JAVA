package com.exampleweb.dto;

public class Employee {
	//private : 외부에서 접근할 수 없는 멤버
	private int empNo;
	private String name;
	private String email;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//public : 외부에서 자유롭게 접근할 수 있는 멤버
	public String info() {
		//String.format : System.out.printf 과 동일한 형식으로 사용하되 문자열만 만들고 출력 기능은 빠진 메서드
		String info = String.format("[%d][%s][%s]", empNo, name, email);
		return info;
	}
}

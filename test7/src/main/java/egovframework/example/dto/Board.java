package egovframework.example.dto;


public class Board {
	private int idx;
	private int psc_idx;
	private String name;
	private String department;
	private String address;
	private String gender;
	private int score;
	private String grade;
	
	public Board() {
		
	}
	public Board(String grade) {
		this.grade=grade;
	}
	
	public int getPsc_idx() {
		return psc_idx;
	}
	public void setPsc_idx(int psc_idx) {
		this.psc_idx = psc_idx;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", psc_idx=" + psc_idx + ", name=" + name + ", department=" + department
				+ ", address=" + address + ", gender=" + gender + ", score=" + score + ", grade=" + grade + "]";
	}
	
}

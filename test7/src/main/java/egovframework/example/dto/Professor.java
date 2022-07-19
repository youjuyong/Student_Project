package egovframework.example.dto;

public class Professor {
	private int p_idx;
	private String p_name;
	private String p_birth;
	private String p_department;
	private int ps_idx;
	private String p_address;
	private String p_email;
	
	@Override
	public String toString() {
		return "Professor [p_idx=" + p_idx + ", p_name=" + p_name + ", p_birth=" + p_birth + ", p_department="
				+ p_department + ", ps_idx=" + ps_idx + ", p_address=" + p_address + ", p_email=" + p_email + "]";
	}
	
	public int getP_idx() {
		return p_idx;
	}
	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_birth() {
		return p_birth;
	}
	public void setP_birth(String p_birth) {
		this.p_birth = p_birth;
	}
	public String getP_department() {
		return p_department;
	}
	public void setP_department(String p_department) {
		this.p_department = p_department;
	}
	public int getPs_idx() {
		return ps_idx;
	}
	public void setPs_idx(int ps_idx) {
		this.ps_idx = ps_idx;
	}
	public String getP_address() {
		return p_address;
	}
	public void setP_address(String p_address) {
		this.p_address = p_address;
	}
	public String getP_email() {
		return p_email;
	}
	public void setP_email(String p_email) {
		this.p_email = p_email;
	}
	
}

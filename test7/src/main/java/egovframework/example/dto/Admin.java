package egovframework.example.dto;


public class Admin {
	
	private int ad_idx;
	private String ad_name;
	private String ad_id;
	private int ad_password;
	
	
	public Admin() {
		
	}
	
	public Admin(String ad_id, int ad_password) {
		// TODO Auto-generated constructor stub
		
		this.ad_id = ad_id;
		this.ad_password = ad_password;
	}
	public int getAd_idx() {
		return ad_idx;
	}
	public void setAd_idx(int ad_idx) {
		this.ad_idx = ad_idx;
	}
	public String getAd_name() {
		return ad_name;
	}
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	public String getAd_id() {
		return ad_id;
	}
	public void setAd_id(String ad_id) {
		this.ad_id = ad_id;
	}
	public int getAd_password() {
		return ad_password;
	}
	public void setAd_password(int ad_password) {
		this.ad_password = ad_password;
	}
	
	@Override
	public String toString() {
		return "Admin [ad_idx=" + ad_idx + ", ad_name=" + ad_name + ", ad_password=" + ad_password + ", ad_id=" + ad_id
				+ "]";
	}
	
	
	
}

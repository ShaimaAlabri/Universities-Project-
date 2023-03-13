package Project;

import java.util.List;

public class MyObject {
//	 + " state_province text ,"
//			 + " domains text ,"
//			 + " country text  ,"
//			 + " web_pages text ,"
//			 + " name text , "
//			 + "alpha_two_code text "
//			 + ");";
	//private String state_province;
	private List<String> domains;
	private String country;
	private List<String> web_pages;
	private String name;
	private String alpha_two_code;
	
	
	
	
	
	public MyObject(String state_province, List<String> domains, String country, List<String> web_pages, String name,
			String alpha_two_code) {
		super();
		//this.state_province = state_province;
		this.domains = domains;
		this.country = country;
		this.web_pages = web_pages;
		this.name = name;
		this.alpha_two_code = alpha_two_code;
	}
public MyObject() {
		// TODO Auto-generated constructor stub
	}
	//	public String getState_province() {
//		return state_province;
//	}
//	public void setState_province(String state_province) {
//		this.state_province = state_province;
//	}
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getWeb_pages() {
		return web_pages;
	}
	public void setWeb_pages(List<String> web_pages) {
		this.web_pages = web_pages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlpha_two_code() {
		return alpha_two_code;
	}
	public void setAlpha_two_code(String alpha_two_code) {
		this.alpha_two_code = alpha_two_code;
	}
	
	

}

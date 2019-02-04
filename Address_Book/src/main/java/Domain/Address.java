package Domain;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String name;
	private String email_id;
	private int phone_no;
	public String getName() {
		return name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", email_id=" + email_id + ", phone_no=" + phone_no + "]";
	}
	
	
	

}

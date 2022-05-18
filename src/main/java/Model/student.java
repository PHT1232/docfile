package Model;

import java.util.Date;

public class student {
	private String studentnumber;
	private String name;
	private String lastname;
	private String phone;
	private String address;
	private String faculty;
	private String dob;
	
	public student() {
		
	}
	
	public student(String studentnumber, String name, String lastname, String phone, String address, String faculty,
			String dob) {
		super();
		this.studentnumber = studentnumber;
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
		this.faculty = faculty;
		this.dob = dob;
	}

	public String getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}

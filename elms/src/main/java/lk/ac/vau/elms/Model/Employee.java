package lk.ac.vau.elms.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Employee extends SuperClass{
	
	private String mobile_num;
	private String role;
	private String email;
	private String password;
	private String address;
	
	@ManyToOne
	@JoinColumn(name="dept_id",referencedColumnName="id",nullable=false)
	private Department dept;
	
	@ManyToMany(mappedBy="emp")
	private List <ApplyLeave> app_leaves;
	
	@OneToOne
	@JoinColumn(name="login_id",referencedColumnName="login_id",nullable=false)
	private Login logins;

	public Employee(String mobile_num, String role, String email, String password, String address, Department dept,
			List<ApplyLeave> app_leaves, Login logins) {
		super();
		this.mobile_num = mobile_num;
		this.role = role;
		this.email = email;
		this.password = password;
		this.address = address;
		this.dept = dept;
		this.app_leaves = app_leaves;
		this.logins = logins;
	}
	
	public Employee() {}

	public String getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public List<ApplyLeave> getApp_leaves() {
		return app_leaves;
	}

	public void setApp_leaves(List<ApplyLeave> app_leaves) {
		this.app_leaves = app_leaves;
	}

	public Login getLogins() {
		return logins;
	}

	public void setLogins(Login logins) {
		this.logins = logins;
	}

}

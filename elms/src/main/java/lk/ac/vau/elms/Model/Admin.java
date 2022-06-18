package lk.ac.vau.elms.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Admin extends SuperClass{
	
	private String Password;
	private int MobileNum;
	
	@JsonManagedReference
	@OneToMany(mappedBy="admins")
	private List <Department> dept;
	
	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY,mappedBy="admins")
	private List <Permission> permissions;
	
	
	@OneToOne
	@JsonManagedReference
	private Login logins;
	
	public Admin() {}

	public Admin(String password, int mobileNum, List<Department> dept, List<Permission> permissions, Login logins) {
		super();
		Password = password;
		MobileNum = mobileNum;
		this.dept = dept;
		this.permissions = permissions;
		this.logins = logins;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getMobileNum() {
		return MobileNum;
	}

	public void setMobileNum(int mobileNum) {
		MobileNum = mobileNum;
	}

	public List<Department> getDept() {
		return dept;
	}

	public void setDept(List<Department> dept) {
		this.dept = dept;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public Login getLogins() {
		return logins;
	}

	public void setLogins(Login logins) {
		this.logins = logins;
	}
	
}

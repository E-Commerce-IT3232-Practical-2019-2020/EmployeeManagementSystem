package lk.ac.vau.elms.Model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Admin extends SuperClass {

	private String Password;
	private int MobileNUm;
	
	@OneToMany(mappedBy="admins")
	private List <Department> dept;
	
	@OneToMany(mappedBy="admins")
	private List <Permission> permissions;
	
	@OneToOne
	@JoinColumn(name="login_id",referencedColumnName="login_id",nullable=false)
	private Login logins;
	
	public Admin() {}

	public Admin(String password, int mobileNUm, List<Department> dept, List<Permission> permissions, Login logins) {
		super();
		Password = password;
		MobileNUm = mobileNUm;
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

	public int getMobileNUm() {
		return MobileNUm;
	}

	public void setMobileNUm(int mobileNUm) {
		MobileNUm = mobileNUm;
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

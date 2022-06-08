package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Login {
	
	@Id
	private String login_id;
	private String username;
	private String password;
	
	@OneToOne(mappedBy="logins")
	private Admin admins;
	
	@OneToOne(mappedBy="logins")
	private Employee emp;

	public Login(String login_id, String username, String password, Admin admins, Employee emp) {
		super();
		this.login_id = login_id;
		this.username = username;
		this.password = password;
		this.admins = admins;
		this.emp = emp;
	}
	
	public Login() {}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin getAdmins() {
		return admins;
	}

	public void setAdmins(Admin admins) {
		this.admins = admins;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

}

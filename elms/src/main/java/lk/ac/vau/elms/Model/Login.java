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
	
}

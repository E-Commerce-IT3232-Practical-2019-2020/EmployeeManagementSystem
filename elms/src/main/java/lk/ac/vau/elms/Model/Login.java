package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {

	@Id
	private String login_id;
	private String username;
	private String password;
	
}

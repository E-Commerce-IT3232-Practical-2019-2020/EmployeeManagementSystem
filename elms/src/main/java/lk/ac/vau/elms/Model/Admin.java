package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private String admin_id;
	private String Name;
	private String UserName;
	private String Password;
	private int MobileNUm;
}

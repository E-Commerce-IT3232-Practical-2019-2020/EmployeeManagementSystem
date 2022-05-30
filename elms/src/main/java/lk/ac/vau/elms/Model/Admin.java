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
	
}

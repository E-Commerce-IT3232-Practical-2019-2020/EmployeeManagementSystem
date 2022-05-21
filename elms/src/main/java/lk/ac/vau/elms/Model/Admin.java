package lk.ac.vau.elms.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Admin {

	@Id
	private String admin_id;
	private String Name;
	private String UserName;
	private String Password;
	private int MobileNUm;
	
	@OneToMany(mappedBy="admins")
	private List <Department> dept;
	
	@OneToMany(mappedBy="admins")
	private List <Permission> permissions;
	
	
	
	
}

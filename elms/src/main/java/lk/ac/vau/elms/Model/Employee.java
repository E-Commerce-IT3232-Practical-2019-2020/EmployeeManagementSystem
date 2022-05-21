package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private String emp_id;
	private String name;
	private String mobile_num;
	private String role;
	private String email;
	private String password;
	private String address;
}

package lk.ac.vau.elms.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
	
	@ManyToOne
	@JoinColumn(name="dept_id",referencedColumnName="dept_id",nullable=false)
	private Department dept;
	
	@ManyToMany(mappedBy="emp")
	private List <ApplyLeave> app_leaves;
	
	@OneToOne
	@JoinColumn(name="login_id",referencedColumnName="login_id",nullable=false)
	private Login logins;
	
}
package lk.ac.vau.elms.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private String dept_id;
	private String name;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="admin_id",referencedColumnName="admin_id", nullable=false)
	private Admin admins;
	
	@OneToMany(mappedBy="dept")
	private List<Employee> employees;

}

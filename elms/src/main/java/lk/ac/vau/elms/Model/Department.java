package lk.ac.vau.elms.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department extends SuperClass {

	private String description;
	
	@ManyToOne
	@JoinColumn(name="admin_id",referencedColumnName="id", nullable=false)
	private Admin admins;
	
	@OneToMany(mappedBy="dept")
	private List<Employee> employees;
	
	public Department() {}

	public Department(String description, Admin admins, List<Employee> employees) {
		super();
		this.description = description;
		this.admins = admins;
		this.employees = employees;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Admin getAdmins() {
		return admins;
	}

	public void setAdmins(Admin admins) {
		this.admins = admins;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}

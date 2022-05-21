package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ApplyLeave {
	
	@Id
	private String lid;
	private String  type;
	private String status;
	private String leave_to;
	private String leave_from;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="emp_id",referencedColumnName="emp_id",nullable=false)
	private Employee emp;

}

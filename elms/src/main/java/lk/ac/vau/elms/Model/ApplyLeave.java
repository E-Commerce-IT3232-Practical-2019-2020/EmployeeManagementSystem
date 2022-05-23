package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ApplyLeave {
	
	@Id
	private String lid;
	private String designation;
	private int no_of_leave_applied;
	private int leave_taken_in_current_yr;
	private String data_of_first_appoinment;
	private String date_of_commencing_leave;
	private String date_of_resuming_duties;
	private String reason;
	private String address_when_on_leave;
	
	@ManyToOne
	@JoinColumn(name="emp_id",referencedColumnName="emp_id",nullable=false)
	private Employee emp;
	
	@OneToOne
	@JoinTable(
	        name="leave_permisson",
	        joinColumns= {@JoinColumn(name="leave_id", referencedColumnName="lid")},
	        inverseJoinColumns= {@JoinColumn(name="permission_id", referencedColumnName="pr_id")}
	    )
	
	private Permission permissons;
	
	

}

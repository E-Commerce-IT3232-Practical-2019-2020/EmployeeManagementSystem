package lk.ac.vau.elms.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ApplyLeave {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String lid;
	private String designation;
	private int no_of_dates_leave_applied;
	private int leave_taken_in_current_yr;
	@Temporal(TemporalType.DATE)
	private Date data_of_first_appointment;
	private Date date_of_commencing_leave;
	private Date date_of_resuming_duties;
	private String reason;
	private String address_when_on_leave;
	
	@ManyToOne
	@JoinColumn(name="emp_id",referencedColumnName="emp_id",nullable=false)
	private Employee emp;
	
	@OneToOne
	@JoinTable(
	        name="leave_permission",
	        joinColumns= {@JoinColumn(name="leave_id", referencedColumnName="lid")},
	        inverseJoinColumns= {@JoinColumn(name="permission_id", referencedColumnName="pr_id")}
	    )
	
	private Permission permissons;
	
	

}

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

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@JsonManagedReference
	@JoinColumn(name="emp_id",referencedColumnName="id",nullable=false)
	private Employee emp;
	
	@OneToOne
	@JoinTable(
	        name="leave_permission",
	        joinColumns= {@JoinColumn(name="leave_id", referencedColumnName="lid")},
	        inverseJoinColumns= {@JoinColumn(name="permission_id", referencedColumnName="pr_id")}
	    )
	private Permission permissons;

	public ApplyLeave(String lid, String designation, int no_of_dates_leave_applied, int leave_taken_in_current_yr,
			Date data_of_first_appointment, Date date_of_commencing_leave, Date date_of_resuming_duties, String reason,
			String address_when_on_leave, Employee emp, Permission permissons) {
		super();
		this.lid = lid;
		this.designation = designation;
		this.no_of_dates_leave_applied = no_of_dates_leave_applied;
		this.leave_taken_in_current_yr = leave_taken_in_current_yr;
		this.data_of_first_appointment = data_of_first_appointment;
		this.date_of_commencing_leave = date_of_commencing_leave;
		this.date_of_resuming_duties = date_of_resuming_duties;
		this.reason = reason;
		this.address_when_on_leave = address_when_on_leave;
		this.emp = emp;
		this.permissons = permissons;
	}
	
	public ApplyLeave() {}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getNo_of_dates_leave_applied() {
		return no_of_dates_leave_applied;
	}

	public void setNo_of_dates_leave_applied(int no_of_dates_leave_applied) {
		this.no_of_dates_leave_applied = no_of_dates_leave_applied;
	}

	public int getLeave_taken_in_current_yr() {
		return leave_taken_in_current_yr;
	}

	public void setLeave_taken_in_current_yr(int leave_taken_in_current_yr) {
		this.leave_taken_in_current_yr = leave_taken_in_current_yr;
	}

	public Date getData_of_first_appointment() {
		return data_of_first_appointment;
	}

	public void setData_of_first_appointment(Date data_of_first_appointment) {
		this.data_of_first_appointment = data_of_first_appointment;
	}

	public Date getDate_of_commencing_leave() {
		return date_of_commencing_leave;
	}

	public void setDate_of_commencing_leave(Date date_of_commencing_leave) {
		this.date_of_commencing_leave = date_of_commencing_leave;
	}

	public Date getDate_of_resuming_duties() {
		return date_of_resuming_duties;
	}

	public void setDate_of_resuming_duties(Date date_of_resuming_duties) {
		this.date_of_resuming_duties = date_of_resuming_duties;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAddress_when_on_leave() {
		return address_when_on_leave;
	}

	public void setAddress_when_on_leave(String address_when_on_leave) {
		this.address_when_on_leave = address_when_on_leave;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Permission getPermissons() {
		return permissons;
	}

	public void setPermissons(Permission permissons) {
		this.permissons = permissons;
	}
	
}

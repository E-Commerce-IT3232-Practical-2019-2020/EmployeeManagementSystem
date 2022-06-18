package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Permission {
	
	@Id
	private String pr_id;
	private String status;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="admin_id" ,referencedColumnName="id",nullable=false)
	private Admin admins;
	
	@OneToOne(mappedBy="permissons")
	private ApplyLeave apply_leaves;

	public Permission(String pr_id, String status, Admin admins, ApplyLeave apply_leaves) {
		super();
		this.pr_id = pr_id;
		this.status = status;
		this.admins = admins;
		this.apply_leaves = apply_leaves;
	}
	
	public Permission() {}

	public String getPr_id() {
		return pr_id;
	}

	public void setPr_id(String pr_id) {
		this.pr_id = pr_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Admin getAdmins() {
		return admins;
	}

	public void setAdmins(Admin admins) {
		this.admins = admins;
	}

	public ApplyLeave getApply_leaves() {
		return apply_leaves;
	}

	public void setApply_leaves(ApplyLeave apply_leaves) {
		this.apply_leaves = apply_leaves;
	}
	
}

package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Permission {
	
	@Id
	private String pr_id;
	private String status;
	
	@ManyToOne
	@JoinColumn(name="admin_id" ,referencedColumnName="admin_id",nullable=false)
	private Admin admins;
	
	

}

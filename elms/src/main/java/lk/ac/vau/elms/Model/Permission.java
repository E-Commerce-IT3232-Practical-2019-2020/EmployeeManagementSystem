package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permission {
	
	@Id
	private String pr_id;
	private String status;

}

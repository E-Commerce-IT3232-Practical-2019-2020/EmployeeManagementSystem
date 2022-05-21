package lk.ac.vau.elms.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	private String dept_id;
	private String name;
	private String description;

}

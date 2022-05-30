package lk.ac.vau.elms.Model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Id;

@MappedSuperclass
public class SuperClass {
	@Id
	private String id;
	private String name;

}

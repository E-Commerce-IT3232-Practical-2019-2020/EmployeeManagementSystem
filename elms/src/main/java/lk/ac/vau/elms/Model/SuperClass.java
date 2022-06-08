package lk.ac.vau.elms.Model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Id;

@MappedSuperclass
public class SuperClass {
	@Id
	private String id;
	private String name;
	
	public SuperClass(){}
	
	public SuperClass(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
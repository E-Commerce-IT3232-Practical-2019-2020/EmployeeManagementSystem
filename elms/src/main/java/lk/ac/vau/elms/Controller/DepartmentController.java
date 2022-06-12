package lk.ac.vau.elms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.elms.Model.Department;
import lk.ac.vau.elms.Repo.DepartmentRepo;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepo repo;
	
	public List<Department> getAllDept(){
		return repo.findAll();
	}
	
	

}

package lk.ac.vau.elms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.elms.Model.Employee;
import lk.ac.vau.elms.Repo.EmployeeRepo;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	
	//http://localhost:8080/emp
	@GetMapping
	public List<Employee> getEmp(){
		return repo.findAll();
	}
	
	//http://localhost:8080/emp/name?empname=kumar
	@GetMapping("/name")
	public List<Employee> getByName(@RequestParam("empname") String name){
		return repo.searchByName(name);
	}
}

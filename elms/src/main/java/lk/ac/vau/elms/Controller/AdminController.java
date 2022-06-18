package lk.ac.vau.elms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.elms.Model.Admin;
import lk.ac.vau.elms.Repo.AdminRepo;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminRepo repo;
	
	//01-http://localhost:8080/admin
	@GetMapping
	public List<Admin> getAll(){
		return repo.findAll();
		
	}
	
	//02-http://localhost:8080/admin/aid?id=admin01
	@GetMapping("/aid")
	public Admin getOne(@RequestParam("id")String id) {
		return repo.findById(id).get();
		
	}
	
	
	@GetMapping("/name")
	public List<Admin>getByName(@RequestParam("nm") String name){
		return repo.searchByName(name);
	}
	
}

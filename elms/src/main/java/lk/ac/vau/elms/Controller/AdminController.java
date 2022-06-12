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
	
	//http://localhost:8080/admin
	@GetMapping
	public List<Admin> getAll(){
		return repo.findAll();
		
	}
	
	@GetMapping("/aid")
	public Admin getOne(@RequestParam("id")String id) {
		return repo.findById(id).get();
		
	}
}

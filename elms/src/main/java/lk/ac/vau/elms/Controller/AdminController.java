package lk.ac.vau.elms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.elms.Model.Admin;
import lk.ac.vau.elms.Repo.AdminRepo;

@RestController
@RequestMapping("/adm")
public class AdminController {
	
	@Autowired
	private AdminRepo repo;
	
	@GetMapping
	public List<Admin> getAll(){
		return repo.findAll();
		//http://localhost:8080/adm
	}

}

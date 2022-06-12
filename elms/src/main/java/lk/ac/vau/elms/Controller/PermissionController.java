package lk.ac.vau.elms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.elms.Model.Permission;
import lk.ac.vau.elms.Repo.PremissionRepo;

@RestController
@RequestMapping("/permission")
public class PermissionController {
	
	@Autowired
	private PremissionRepo repo;
	
	//http://localhost:8080/permission
	public List <Permission> getAllPermissions(){
		return repo.findAll();
	}
		
}

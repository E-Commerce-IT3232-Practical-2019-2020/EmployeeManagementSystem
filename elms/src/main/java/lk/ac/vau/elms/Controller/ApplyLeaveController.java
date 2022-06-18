package lk.ac.vau.elms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lk.ac.vau.elms.Model.ApplyLeave;
import lk.ac.vau.elms.Repo.LeaveRepo;

@RestController
@RequestMapping("/leave")
public class ApplyLeaveController {
	
	@Autowired
	private LeaveRepo repo;
	
	//01-http://localhost:8080/admin
	@GetMapping
	public List<ApplyLeave> getAll(){
		return repo.findAll();
		
	}
}

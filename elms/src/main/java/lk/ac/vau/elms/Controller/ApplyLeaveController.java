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
	
	@GetMapping
	//http://localhost:8080/leave
	public List <ApplyLeave> getAll(){
		return repo.findAll();
	}

}

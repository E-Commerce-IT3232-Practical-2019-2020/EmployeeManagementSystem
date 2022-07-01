package lk.ac.vau.elms.Service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.elms.Repo.DepartmentRepo;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepo repo;

	public int NoofEmpInDept(String did) {
		if (repo.findById(did).isEmpty()) {
			throw new EntityNotFoundException("No department found with id " + did);
		}

		return repo.numberOfEmp(did);
	}
}

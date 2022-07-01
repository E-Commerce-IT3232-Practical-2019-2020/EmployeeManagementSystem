package lk.ac.vau.elms.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.elms.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String>{
	@Query("select e from Employee e where name like %?1%")
	public List<Employee> searchByName(String name);
	
	
}

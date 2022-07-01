package lk.ac.vau.elms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.elms.Model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,String>{
	
	@Query("select count(e) from Department d join d.employee e where d.Id = ?1")
	public int numberOfEmp(String did);

}

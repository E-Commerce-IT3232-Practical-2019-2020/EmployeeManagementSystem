package lk.ac.vau.elms.Repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.elms.Model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin,String> {
	
		@Query("select a from Admin a where name like %?1%")
		public List<Admin> searchByName(String name);
		
	
}

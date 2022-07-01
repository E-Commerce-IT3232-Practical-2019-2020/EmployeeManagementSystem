package lk.ac.vau.elms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.elms.Model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login,String>{

}

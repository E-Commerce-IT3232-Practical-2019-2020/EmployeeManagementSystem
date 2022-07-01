package lk.ac.vau.elms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.elms.Model.ApplyLeave;

@Repository
public interface LeaveRepo extends JpaRepository<ApplyLeave,String> {

}

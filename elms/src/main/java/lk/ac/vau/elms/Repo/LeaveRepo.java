package lk.ac.vau.elms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ac.vau.elms.Model.ApplyLeave;

public interface LeaveRepo extends JpaRepository<ApplyLeave,String> {

}

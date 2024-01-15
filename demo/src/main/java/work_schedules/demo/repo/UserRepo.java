package work_schedules.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import work_schedules.demo.models.User;

/**
 * InnerUserRepo
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}

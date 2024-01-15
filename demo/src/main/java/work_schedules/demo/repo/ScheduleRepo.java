package work_schedules.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import work_schedules.demo.models.Schedule;

/**
 * InnerUserRepo
 */
@Repository
public interface ScheduleRepo extends JpaRepository<Schedule, Long> {

}

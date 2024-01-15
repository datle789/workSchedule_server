package work_schedules.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import work_schedules.demo.models.Schedule;
import work_schedules.demo.models.User;
import work_schedules.demo.repo.ScheduleRepo;
import work_schedules.demo.repo.UserRepo;
import work_schedules.demo.DTO.ScheduleDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepo scheduleRepo;

    @Autowired
    private UserRepo userRepo;

    private static final Logger logger = LoggerFactory.getLogger(ScheduleService.class);

    public Schedule saveSchedule(ScheduleDto scheduleDTO) {
        Schedule schedule = new Schedule();
        User user = userRepo.findById(scheduleDTO.getUserId()).get();
        logger.info("Log message: {}", schedule);
        schedule.setUser(user);
        schedule.setStartDate(scheduleDTO.getStartDate());
        schedule.setEndDate(scheduleDTO.getEndDate());
        schedule.setShift(scheduleDTO.getShift());
        schedule.setNotes(scheduleDTO.getNotes());
        scheduleRepo.save(schedule);
        return schedule;
    }

}

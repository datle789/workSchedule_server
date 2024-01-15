package work_schedules.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work_schedules.demo.DTO.ScheduleDto;
import work_schedules.demo.models.Schedule;
import work_schedules.demo.models.User;
import work_schedules.demo.services.ScheduleService;
import work_schedules.demo.services.UserService;

@RestController
@RequestMapping(path = "/api/schedules")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @PostMapping(value = "/create")
    public Schedule saveUser(@RequestBody ScheduleDto scheduleDTO) {
        return scheduleService.saveSchedule(scheduleDTO);

    }
}

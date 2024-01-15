package work_schedules.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work_schedules.demo.models.User;
import work_schedules.demo.repo.UserRepo;
import work_schedules.demo.services.UserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    // @Autowired
    // private UserRepo userRepo;

    @GetMapping(value = "/")
    public List<User> getUser() {
        return userService.getUsers();
        // return userRepo.findAll();

    }

    @PostMapping(value = "/create")
    public String saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping(value = "/{id}")
    User getUser(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public User deleteUser(@PathVariable long id) {
        return userService.deleteUser(id);
    }

    @PutMapping(value = "update/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

}

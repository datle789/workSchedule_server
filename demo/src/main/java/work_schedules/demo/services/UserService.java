package work_schedules.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import work_schedules.demo.models.User;
import work_schedules.demo.repo.UserRepo;
import java.time.LocalDateTime;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public String saveUser(User user) {
        userRepo.save(user);
        return "saved...";
    }

    public User getUserById(long id) {
        return userRepo.findById(id).get();
    }

    public User deleteUser(long id) {
        User deleteUser = userRepo.findById(id).get();
        deleteUser.setStatus(0);
        userRepo.save(deleteUser);
        return deleteUser;
    }

    public User updateUser(long id, User user) {

        User updateUser = userRepo.findById(id).get();
        updateUser.setUsername(user.getUsername());
        updateUser.setEmail(user.getEmail());
        updateUser.setPhone(user.getPhone());
        updateUser.setAvatar(user.getAvatar());
        updateUser.setPosition(user.getPosition());
        updateUser.setIsAdmin(user.getIsAdmin());
        updateUser.setUpdatedAt();
        userRepo.save(updateUser);
        return updateUser;
    }

}

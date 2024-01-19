package com.example.demo;

import com.example.demo.UserJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/user/create")
    public Integer createUser(@RequestBody UserJson userJson) {
        User user = new User();
        user.setName(userJson.getName());
        user.setPassword(userJson.getPassword());
        user.setDate(LocalDate.now());
        userRepo.save(user);
        return user.getId();
    }

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "id") Integer id) {
        User user = userRepo.getById(id);
        return user;
    }

    public UserDataJson update(@RequestBody UserJson userJson, @RequestParam(value = "login") Integer login) {
        User user = userRepo.getById(login);
        if (user == null) return null;
        UserJson userJson = new UserJson();
        userJson.setLogin(login);
        userJson.setPrevName(user.getName());
        userJson.setPrevPassword(user.getPassword());
        userJson.setDate(user.getDate());
        user.setName(userJson.getName());
        user.setPassword(userJson.getPassword());
        userJson.setNewName(userJson.getName());
        userJson.setNewPassword(userJson.getPassword());
        userRepo.save(user);
        return userJson;
    }

    @DeleteMapping
    public void delete(@RequestParam(value = "login") Integer login) {
        userRepo.deleteById(login);
    }

}

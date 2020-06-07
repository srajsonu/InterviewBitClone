package ml.srajsonu.interviebitclone.controllers;

import ml.srajsonu.interviebitclone.dto.ResponseDTO;
import ml.srajsonu.interviebitclone.models.User;
import ml.srajsonu.interviebitclone.services.UserServices;
import ml.srajsonu.interviebitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@RestController
@RequestMapping(Constants.USER_END_POINT)
public class UserController {

    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userServices.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseDTO<User> getUser(@PathVariable(name = "id") UUID id) {

        User serviceResponse = userServices.getUser(id);
        if (serviceResponse == null) {
            return new ResponseDTO(HttpStatus.NOT_FOUND, null);
        }
        return new ResponseDTO(HttpStatus.FOUND,userServices.getUser(id));
    }
}

package ml.srajsonu.interviebitclone.services;

import ml.srajsonu.interviebitclone.models.User;
import ml.srajsonu.interviebitclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service //service is used to write business logic
public class UserServices {

    private UserRepository userRepository;

    @Autowired
    public UserServices(@Qualifier("inmemory") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public User getUser(UUID id) {
        Optional<User> foundUser = userRepository.getUserById(id);
        if (foundUser.isEmpty()){
            return null;
        }
        return foundUser.get();
    }
}

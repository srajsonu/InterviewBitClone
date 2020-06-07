package ml.srajsonu.interviebitclone.repository;


import ml.srajsonu.interviebitclone.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    User createUser(User user);
    Optional<User> getUserById(UUID id);
}

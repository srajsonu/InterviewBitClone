package ml.srajsonu.interviebitclone.repository;

import ml.srajsonu.interviebitclone.models.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("inmemory")
public class UserRepositoryImpl implements UserRepository {

    private List<User> userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user) {

        User createdUser = new User(user.getName(), user.getGender());
        userDatabase.add(createdUser);
        return createdUser;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        return userDatabase.stream()
                .filter(
                        user -> user.getId().equals(id)
                ).findFirst();
    }
}

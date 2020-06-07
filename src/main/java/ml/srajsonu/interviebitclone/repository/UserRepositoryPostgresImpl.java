package ml.srajsonu.interviebitclone.repository;

import ml.srajsonu.interviebitclone.models.User;
import ml.srajsonu.interviebitclone.utils.Constants;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserRepositoryPostgresImpl implements UserRepository {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        return Optional.empty();
    }
}

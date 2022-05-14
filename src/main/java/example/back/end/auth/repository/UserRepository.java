package example.back.end.auth.repository;

import example.back.end.auth.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String Email);

    Boolean existsByEmail(String email);
}
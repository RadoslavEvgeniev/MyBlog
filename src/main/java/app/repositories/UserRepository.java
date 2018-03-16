package app.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import app.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}
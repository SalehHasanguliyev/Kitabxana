package az.kitab.Kitabxana.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import az.kitab.Kitabxana.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String username);

}

package com.registration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.registration.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
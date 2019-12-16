package com.cldiaz.react.userjugs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cldiaz.react.userjugs.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	
}

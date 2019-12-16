package com.cldiaz.react.userjugs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cldiaz.react.userjugs.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long>{
	
	Group findByName(String name);
	
	List<Group> findAllByUserId(String id);

}

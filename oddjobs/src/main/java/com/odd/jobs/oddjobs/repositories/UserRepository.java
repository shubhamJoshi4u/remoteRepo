package com.odd.jobs.oddjobs.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odd.jobs.oddjobs.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

	public Optional<UserModel> findByUserName(String userName);
	
}

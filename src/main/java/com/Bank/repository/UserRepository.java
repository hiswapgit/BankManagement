package com.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bank.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	/**
	 * This method is used to fetch user which matches with username and password
	 * return user who matches the condation
	 *
	 */
	public User findUserNameAndPassword(String username,String password);
}

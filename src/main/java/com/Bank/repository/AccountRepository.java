package com.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bank.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	/**
	 * This method is used to fetch user by id
	 * return user which mathces passed id
	 *
	 */
	public Account findByUserid(Long userid);
}

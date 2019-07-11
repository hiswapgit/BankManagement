package com.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bank.entity.Transcation;

@Repository
public interface TranscationRepository extends JpaRepository<Transcation, Long> {

}

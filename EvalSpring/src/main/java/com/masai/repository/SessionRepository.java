package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.UserSession;

public interface SessionRepository extends JpaRepository<UserSession, Integer>{

	  public UserSession findByUuid(String uuid);
}

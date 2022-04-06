package com.sonu.main.repository;

import com.sonu.main.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, String> {

    Optional<UserDetails> findByUserEmail(String userEmail);

}

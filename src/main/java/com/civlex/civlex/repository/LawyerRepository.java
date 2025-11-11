package com.civlex.civlex.repository;

import com.civlex.civlex.models.users.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LawyerRepository extends JpaRepository<Lawyer, Long> {

    Optional<Lawyer> findByEmail(String email);
    boolean existsByOab(String oab);
    boolean existsByEmail(String email);
}

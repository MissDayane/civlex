package com.civlex.civlex.repository;

import com.civlex.civlex.models.users.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LawyerRepository extends JpaRepository <Lawyer, Long> {
}

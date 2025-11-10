package com.civlex.civlex.repository;

import com.civlex.civlex.models.cases.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository <Case, Long> {
}

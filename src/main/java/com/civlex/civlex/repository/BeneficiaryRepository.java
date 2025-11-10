package com.civlex.civlex.repository;

import com.civlex.civlex.models.users.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository <Beneficiary, Long> {
}

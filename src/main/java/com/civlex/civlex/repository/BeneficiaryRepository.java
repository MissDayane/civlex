package com.civlex.civlex.repository;

import com.civlex.civlex.models.users.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {
    Optional<Beneficiary> findByEmail(String email);
    Boolean existsByCadUnico(String cadUnico);
    boolean existsByEmail(String email);
}

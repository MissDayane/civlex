package com.civlex.civlex.repository;

import com.civlex.civlex.models.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository <Users, Long> {


}

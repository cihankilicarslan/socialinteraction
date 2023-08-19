package com.social.interaction.repository;

import com.social.interaction.entities.Role;
import com.social.interaction.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(UserRole name);
}

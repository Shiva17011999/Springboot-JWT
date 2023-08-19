package com.shiva.Springboot.JWT.repository;

import com.shiva.Springboot.JWT.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String role);

}

package com.univlittoral.projectbackmaster.repository;

import com.univlittoral.projectbackmaster.entity.AuteurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<AuteurEntity, Long> {
}

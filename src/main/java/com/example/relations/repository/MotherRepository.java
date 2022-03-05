package com.example.relations.repository;

import com.example.relations.entity.oneToOne.Mother;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherRepository extends JpaRepository<Mother, Long> {
}

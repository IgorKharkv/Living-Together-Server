package com.example.livingtogether.repository;

import com.example.livingtogether.model.AuPassage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuPassageRepository extends JpaRepository<AuPassage, Long> {
}

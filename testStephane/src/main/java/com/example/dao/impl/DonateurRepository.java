package com.example.dao.impl;

import com.example.teststephane.Donateur;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DonateurRepository extends JpaRepository<Donateur, Long> {
}

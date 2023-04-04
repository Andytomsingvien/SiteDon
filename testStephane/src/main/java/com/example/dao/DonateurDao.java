package com.example.dao;

import com.example.teststephane.Donateur;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Configuration
@ComponentScan(basePackages = "com.example")
public interface DonateurDao  extends JpaRepository<Donateur, Long>  {
    List<Donateur> getAllDonateurs();

    void saveDonateur(String nom,String prenom,String email,int montantDon);
}

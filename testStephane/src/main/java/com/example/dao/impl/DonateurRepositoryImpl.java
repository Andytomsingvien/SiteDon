package com.example.dao.impl;

import com.example.dao.DonateurDao;
import com.example.dao.impl.DonateurRepository;
import com.example.teststephane.Donateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary

public abstract class DonateurRepositoryImpl implements DonateurDao {

    @Autowired
    private DonateurRepository donateurRepository;

    @Override
    public List<Donateur> getAllDonateurs() {
        return donateurRepository.findAll();
    }

    @Override
    public void saveDonateur(String nom, String prenom, String email, int montantDon) {
        Donateur donateur = new Donateur();
        donateur.setFirstname(prenom);
        donateur.setLastname(nom);
        donateur.setEmail(email);
        donateur.setMontantDon(montantDon);
        donateurRepository.save(donateur);
    }
}

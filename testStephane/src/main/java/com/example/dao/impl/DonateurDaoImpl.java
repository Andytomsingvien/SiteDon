package com.example.dao.impl;

import com.example.dao.DonateurDao;
import com.example.teststephane.Donateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class DonateurDaoImpl implements DonateurDao {
    @Autowired
    @Qualifier("donateurRepositoryImpl")
    private DonateurDao donateurRepository;
/*
    @Override
    public List<Donateur> getAllDonateurs(){
        return donateurRepository.findAll();
    }

 */

    @Override
    public void saveDonateur(String nom,String prenom,String email,int montantDon){
        Donateur donateur = new Donateur();
        donateur.setFirstname(prenom);
        donateur.setLastname(nom);
        donateur.setEmail(email);
        donateur.setMontantDon(montantDon);
        donateurRepository.save(donateur);
    }
}

package com.example.teststephane;

import com.example.dao.DonateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Configuration
@ComponentScan(basePackages = "com.example.dao")
@Controller
public class WebController {
    @Qualifier("donateurRepositoryImpl")
    private DonateurDao donateurDao;
    @RequestMapping("/")
    public String home(Model model) {
        return "accueil";
    }

    @RequestMapping("/don")
    public String about(Model model) {
        return "don";
    }

    @RequestMapping("/mL")
    public String mL(Model model) {
        return "mL";
    }

    @RequestMapping("/form")
    public String endPointForm(Model model) {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("donateur") Donateur donateur, Model model) {
        model.addAttribute("donateur", donateur);
        donateurDao.saveDonateur(donateur.getLastname(), donateur.getFirstname(), donateur.getEmail(), donateur.getMontantDon());
        return "result";
    }

    @GetMapping("/all")
    String afficherAllDonateurs(Model model) {
        List<Donateur> donateurs = donateurDao.getAllDonateurs();
        model.addAttribute("donateurs", donateurs);
        return "donateurs";
    }



}

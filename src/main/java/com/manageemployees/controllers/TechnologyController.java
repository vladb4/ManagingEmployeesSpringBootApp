package com.manageemployees.controllers;

import com.manageemployees.model.Technology;
import com.manageemployees.repositories.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by v.balan on 12-Jul-17.
 */

@Controller
public class TechnologyController {

    @Autowired
    TechnologyRepository technologyRepository;

    @GetMapping("addTechnology")
    public String addTechnology(Model model){
        Technology technology=new Technology();
        model.addAttribute("technology", technology);
        return "addTechnology";
    }

    @PostMapping("addTechnology")
    public String addTechnology(Technology technology, BindingResult result){
        this.technologyRepository.save(technology);
        return "redirect:/allEmployees";
    }
}

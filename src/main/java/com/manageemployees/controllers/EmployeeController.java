package com.manageemployees.controllers;

import com.manageemployees.repositories.EmployeeRepository;
import com.manageemployees.repositories.ManagerRepository;
import com.manageemployees.repositories.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by v.balan on 11-Jul-17.
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    private ManagerRepository managerRepository;
    @Autowired
    private TechnologyRepository technologyRepository;

  @RequestMapping(value={"/allEmployees", "/"}, method = {RequestMethod.GET})
 public String allEmployees(ModelMap model){
        model.put("employees", employeeRepository.findAll());
        model.put("technologies", technologyRepository.findAll());
     return "allEmployees";
 }

}

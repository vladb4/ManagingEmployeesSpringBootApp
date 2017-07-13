package com.manageemployees.controllers;

import com.manageemployees.model.Manager;
import com.manageemployees.repositories.EmployeeRepository;
import com.manageemployees.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by v.balan on 12-Jul-17.
 */


@Controller
public class ManagerController {

    @Autowired
    ManagerRepository managerRepository;

    @RequestMapping( value={"/addManager"},method = {RequestMethod.POST})
    public String addManager(Manager manager, BindingResult result) {
            if(!result.hasErrors()){
                this.managerRepository.save(manager);
            }else{
                return "Error";
            }
        return "redirect:/allEmployees";
    }

    @RequestMapping(value = {"/addManager"},method = {RequestMethod.GET})
    public String addManager(Model model){
        Manager manager = new Manager();
        model.addAttribute("manager", manager);
        return "addManager";
    }
}

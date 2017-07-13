package com.manageemployees.controllers;

import com.manageemployees.model.Employee;
import com.manageemployees.model.Manager;
import com.manageemployees.repositories.EmployeeRepository;
import com.manageemployees.repositories.ManagerRepository;
import com.manageemployees.repositories.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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

    @RequestMapping(value = {"/allEmployees", "/"}, method = {RequestMethod.GET})
    public String allEmployees(ModelMap model) {
        model.put("employees", employeeRepository.findAll());
        model.put("technologies", technologyRepository.findAll());
        return "allEmployees";
    }

    @RequestMapping(method ={RequestMethod.GET})
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        List<Manager> managers = managerRepository.findAll();
        model.addAttribute("managers",managers);
        model.addAttribute("technologies", technologyRepository.findAll());
        return "addEmployee";
    }

    @RequestMapping(method = {RequestMethod.POST})
    public String addEmployee(Employee employee, BindingResult result){
            if(!result.hasErrors()){
                this.employeeRepository.save(employee);
            }else{
                return "Error";
            }
        return "redirect:/allEmployees";
    }

}

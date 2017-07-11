package com.manageemployees.repositories;

import com.manageemployees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by v.balan on 11-Jul-17.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

package com.manageemployees.repositories;

import com.manageemployees.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by v.balan on 11-Jul-17.
 */
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}


package com.manageemployees.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by v.balan on 11-Jul-17.
 */
public class Employee {

    private int id;
    private String name;
    private Manager manager;
    private Set<Technology> technology = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Set<Technology> getTechnology() {
        return technology;
    }

    public void setTechnology(Set<Technology> technology) {
        this.technology = technology;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                ", technology=" + technology +
                '}';
    }


}


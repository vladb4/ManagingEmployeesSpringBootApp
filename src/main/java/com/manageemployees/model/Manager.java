package com.manageemployees.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by v.balan on 11-Jul-17.
 */
@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy ="manager", cascade = {CascadeType.PERSIST})
    private Set<Employee> employees = new HashSet<>();

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }

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

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


}

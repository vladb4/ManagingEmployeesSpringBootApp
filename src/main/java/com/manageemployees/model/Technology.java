package com.manageemployees.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by v.balan on 11-Jul-17.
 */
@Entity
public class Technology {

    @Id
    @GeneratedValue
    private int id;

    @Override
    public String toString() {
        return name;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

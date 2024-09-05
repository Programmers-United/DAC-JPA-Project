package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.Entity;

@Entity
public class Staff extends Person{
    private String function;

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}

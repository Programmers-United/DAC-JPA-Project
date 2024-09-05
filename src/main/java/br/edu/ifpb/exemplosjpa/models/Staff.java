package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Staff extends Person{
    @Column(nullable = false)
    private String function;

    public Staff() {
        super();
    }

    public Staff(String nome, String cpf, String telefone, LocalDate dataNascimento, String rua, String bairro, String cidade, String function) {
        super(nome, cpf, telefone, dataNascimento, rua, bairro, cidade);
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}

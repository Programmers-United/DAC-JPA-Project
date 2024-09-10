package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Reader extends Person {
    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "reader", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Ticket> tickets;

    public Reader() {
        super();
    }

    public Reader(String nome, String cpf, String telefone, LocalDate dataNascimento, String rua, String bairro, String cidade, String email) {
        super(nome, cpf, telefone, dataNascimento, rua, bairro, cidade);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

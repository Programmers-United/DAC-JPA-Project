package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "readers")
public class Reader extends Person {
    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "reader", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Ticket> tickets;
    @OneToMany(mappedBy = "reader", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Loan> loans;

    public Reader() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public void addTicket(Ticket ticket) {
        if (tickets == null) tickets = new ArrayList<>();
    }

    public List<Loan> getLoans() {
        return Collections.unmodifiableList(loans);
    }

    public void addLoan(Loan loan) {
        if (loans == null) loans = new ArrayList<>();
        loans.add(loan);
    }
}

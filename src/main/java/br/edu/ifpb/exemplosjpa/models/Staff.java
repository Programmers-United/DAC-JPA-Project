package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "staff")
public class Staff extends Person{

    @Column(nullable = false)
    private String function;

    @OneToMany(mappedBy = "staff",cascade = CascadeType.PERSIST)
    private List<Delivery> deliveries;
    @OneToMany(mappedBy = "staff", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Loan> loans;

    public Staff() {
        super();
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public List<Loan> getLoans() {
        return Collections.unmodifiableList(loans);
    }

    public void addLoan(Loan loan) {
        if (loans == null) loans = new ArrayList<>();
        loans.add(loan);
    }

    public List<Delivery> getDeliveries() {
        return Collections.unmodifiableList(deliveries);
    }

    public void addDelivery(Delivery delivery) {
        if (deliveries == null) deliveries = new ArrayList<>();
        deliveries.add(delivery);
    }
}

package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "exemplary_available")
public class AvailableExemplary extends Exemplary{

    @Column
    private LocalDate acquisitionDate;
    @Column
    private String edition;
    @Column
    private String status;
    @ManyToMany(mappedBy = "listExemplaryAvailable")
    private List<Delivery> deliveries;
    @ManyToMany
    private List<Loan> loans;

    public AvailableExemplary() {
        super();
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Delivery> getDeliveries() {
        return Collections.unmodifiableList(deliveries);
    }

    public void addDelivery(Delivery delivery) {
        if (deliveries == null) deliveries = new ArrayList<>();
        deliveries.add(delivery);
    }

    public List<Loan> getLoans() {
        return Collections.unmodifiableList(loans);
    }

    public void addLoan(Loan loan) {
        if (loans == null) loans = new ArrayList<>();
        loans.add(loan);
    }
}

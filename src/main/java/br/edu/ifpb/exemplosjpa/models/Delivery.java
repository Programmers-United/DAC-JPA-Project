package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="deliveries")
public class Delivery implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;
    @OneToMany(mappedBy = "delivery", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Ticket> tickets;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<AvailableExemplary> listExemplaryAvailable;
    @OneToOne(mappedBy = "delivery")
    private Loan loan;

    public Delivery() {
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public void addTicket(Ticket ticket) {
        if (tickets == null) tickets = new ArrayList<>();
        tickets.add(ticket);
    }

    public List<AvailableExemplary> getListExemplaryAvailable() {
        return Collections.unmodifiableList(listExemplaryAvailable);
    }

    public void addAvailableExemplary(AvailableExemplary availableExemplary) {
        if (listExemplaryAvailable == null) listExemplaryAvailable = new ArrayList<>();
        listExemplaryAvailable.add(availableExemplary);
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
}

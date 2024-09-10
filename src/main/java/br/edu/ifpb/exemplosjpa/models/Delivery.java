package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="deliveries")
public class Delivery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDateTime dateWithTime;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;
    @OneToMany(mappedBy = "delivery", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Ticket> tickets;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<AvailableExemplary> listExemplaryAvailable;
    @OneToOne
    private Loan loan;

    public Delivery() {
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getDateWithTime() {
        return dateWithTime;
    }

    public void setDateWithTime(LocalDateTime dateWithTime) {
        this.dateWithTime = dateWithTime;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<AvailableExemplary> getListExemplaryAvailable() {
        return listExemplaryAvailable;
    }

    public void setListExemplaryAvailable(List<AvailableExemplary> listExemplaryAvailable) {
        this.listExemplaryAvailable = listExemplaryAvailable;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
}

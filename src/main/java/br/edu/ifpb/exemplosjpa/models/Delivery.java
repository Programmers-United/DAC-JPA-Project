package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="deliverys")
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
    private List<AvailableExemplary> listAvailableExemplary;
    @OneToOne
    private Loan loan;

    public Delivery() {
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDateWithTime() {
        return dateWithTime;
    }

    public void setDateWithTime(LocalDateTime dateWithTime) {
        this.dateWithTime = dateWithTime;
    }

    public Loan getLoan() {
        return loan;
    }

    public List<AvailableExemplary> getListExemplaryAvailable() {
        return listAvailableExemplary;
    }

    public Staff getStaff() {
        return staff;
    }

    public void addStaff(Staff staff) {
        if(this.staff == null) {
            this.staff = staff;
        }
    }

    public void addTicket(Ticket ticket) {
        if(this.tickets == null) {
            this.tickets = new ArrayList<>();
        }
        this.tickets.add(ticket);
    }

    public void addExemplaryAvailable(AvailableExemplary availableExemplary) {
        if (this.listAvailableExemplary == null) {
            this.listAvailableExemplary = new ArrayList<>();
        }
        this.listAvailableExemplary.add(availableExemplary);
    }

    public void addLoan(Loan loan) {
        if(this.loan == null) {
            this.loan = loan;
        }
    }
}

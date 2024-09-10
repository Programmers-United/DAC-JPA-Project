package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "loans")
public class Loan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate date;
    private LocalDate expectedDate;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Delivery delivery;
    @ManyToOne
    @JoinColumn(name = "reader_id", nullable = false)
    private Reader reader;
    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;
    @ManyToMany(mappedBy = "loans")
    private List<AvailableExemplary> availableExemplaries;

    public UUID getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(LocalDate expectedDate) {
        this.expectedDate = expectedDate;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public List<AvailableExemplary> getAvailableExemplaries() {
        return Collections.unmodifiableList(availableExemplaries);
    }

    public void addAvailableExemplary(AvailableExemplary availableExemplary) {
        if (availableExemplaries == null) availableExemplaries = new ArrayList<>();
        availableExemplaries.add(availableExemplary);
    }
}

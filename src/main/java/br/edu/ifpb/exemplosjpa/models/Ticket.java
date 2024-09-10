package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="tickets")
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate date;
    private String reason;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "delivery_id", nullable = false)
    private Delivery delivery;
    @ManyToOne
    @JoinColumn(name = "reader_id", nullable = false)
    private Reader reader;

    public Ticket() {
    }

    public Reader getReader() {
        return reader;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void addDelivery(Delivery delivery) {
        if (this.delivery == null) {
            this.delivery = delivery;
        }
    }

}

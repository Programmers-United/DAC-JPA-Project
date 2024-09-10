package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "loans")
public class Loan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne(mappedBy = "loan", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Delivery delivery;
}

package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "exemplary_available")
public class ExemplaryAvailable extends Exemplary{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToMany(mappedBy = "listExemplaryAvailable")
    private List<Delivery> deliveries;
}

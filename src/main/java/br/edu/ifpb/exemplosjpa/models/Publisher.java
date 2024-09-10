package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "publishers")
public class Publisher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String nationality;


    @ManyToMany(mappedBy = "publishers")
    private List<Book> books;

    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}

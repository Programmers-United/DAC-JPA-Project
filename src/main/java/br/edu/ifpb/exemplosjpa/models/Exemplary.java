package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "exemplaries")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Exemplary implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    public Exemplary() {}

    public Exemplary(Book book) {
        this.book = book;
    }

    public UUID getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

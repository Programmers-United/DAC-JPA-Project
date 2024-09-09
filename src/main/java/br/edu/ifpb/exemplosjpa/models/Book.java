package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "books")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private LocalDateTime yearOfPublication;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Gender> genders;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Book> sequelBooks;
    @ManyToMany(mappedBy = "sequelBooks", cascade = CascadeType.PERSIST)
    private List<Book> originalBooks;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Author> authors;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Publisher> publishers;
    @OneToMany(mappedBy = "book", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Exemplary> exemplaries;

    public Book() {
    }

    public Book(String title, LocalDateTime yearOfPublication, List<Gender> genders, List<Book> sequelBooks, List<Book> originalBooks, List<Author> authors, List<Publisher> publishers, List<Exemplary> exemplaries) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.genders = genders;
        this.sequelBooks = sequelBooks;
        this.originalBooks = originalBooks;
        this.authors = authors;
        this.publishers = publishers;
        this.exemplaries = exemplaries;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(LocalDateTime yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public List<Gender> getGenders() {
        return Collections.unmodifiableList(genders);
    }

    public void addGender(Gender gender) {
        if (genders == null) {
            genders = new ArrayList<>();
        }

        genders.add(gender);
    }

    public List<Book> getSequelBooks() {
        return Collections.unmodifiableList(sequelBooks);
    }

    public void addSequelBook(Book book) {
        if (sequelBooks == null) {
            sequelBooks = new ArrayList<>();
        }
        sequelBooks.add(book);
    }

    public List<Book> getOriginalBooks() {
        return Collections.unmodifiableList(originalBooks);
    }

    public void addOriginalBook(Book book) {
        if (originalBooks == null) {
            originalBooks = new ArrayList<>();
        }
        originalBooks.add(book);
    }

    public List<Author> getAuthors() {
        return Collections.unmodifiableList(authors);
    }

    public void addAuthor(Author author) {
        if (authors == null) {
            authors = new ArrayList<>();
        }
        authors.add(author);
    }

    public List<Publisher> getPublishers() {
        return Collections.unmodifiableList(publishers);
    }

    public void addPublisher(Publisher publisher) {
        if (publishers == null) {
            publishers = new ArrayList<>();
        }
        publishers.add(publisher);
    }

    public List<Exemplary> getExemplaries() {
        return Collections.unmodifiableList(exemplaries);
    }

    public void addExemplary(Exemplary exemplary) {
        if (exemplaries == null) {
            exemplaries = new ArrayList<>();
        }
        exemplaries.add(exemplary);
    }
}

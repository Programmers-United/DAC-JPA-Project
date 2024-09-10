package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false)
    private String rua;
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false)
    private String cidade;

    public Person(){}

    public Person(String nome, String cpf, String telefone, LocalDate dataNascimento,  String rua, String bairro, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }
}

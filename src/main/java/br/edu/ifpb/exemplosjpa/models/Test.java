package br.edu.ifpb.exemplosjpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table
public class Test implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal value;

    @Version
    private Long version;

    public Test() {
    }

    public Test(UUID uuid, String name, BigDecimal value) {
        this.uuid = uuid;
        this.name = name;
        this.value = value;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Long getVersion() {
        return version;
    }
}

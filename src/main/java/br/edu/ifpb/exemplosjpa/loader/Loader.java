package br.edu.ifpb.exemplosjpa.loader;

import br.edu.ifpb.exemplosjpa.models.Author;
import br.edu.ifpb.exemplosjpa.models.Book;
import br.edu.ifpb.exemplosjpa.models.Exemplary;
import br.edu.ifpb.exemplosjpa.models.Gender;
import br.edu.ifpb.exemplosjpa.models.Publisher;
import br.edu.ifpb.exemplosjpa.models.Test;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class Loader implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(Loader.class);

    @PersistenceContext
    private final EntityManager entityManager;

    public Loader(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        // Coloque o seu código aqui
    }

}

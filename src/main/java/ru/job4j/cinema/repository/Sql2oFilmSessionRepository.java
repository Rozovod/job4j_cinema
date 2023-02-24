package ru.job4j.cinema.repository;

import org.sql2o.Sql2o;
import ru.job4j.cinema.model.FilmSession;

import java.util.Collection;

public class Sql2oFilmSessionRepository implements FilmSessionRepository {
    private final Sql2o sql2o;

    public Sql2oFilmSessionRepository(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public Collection<FilmSession> findAll() {
        try (var connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM films").executeAndFetch(FilmSession.class);
        }
    }
}
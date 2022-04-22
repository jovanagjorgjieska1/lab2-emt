package mk.ukim.finki.lab2_193009.service;

import mk.ukim.finki.lab2_193009.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();

    Optional<Author> findById(Long id);

    Optional<Author> save(String name, String surname, Long countryId);

    Optional<Author> edit(Long id, String name, String surname, Long countryId);

    void deleteById(Long id);
}

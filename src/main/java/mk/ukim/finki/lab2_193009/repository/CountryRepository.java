package mk.ukim.finki.lab2_193009.repository;

import mk.ukim.finki.lab2_193009.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}

package Main.repositories;

import Main.entities.CD;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CDRepository extends CrudRepository<CD, Long> {
    CD save(CD cd);
    Optional<CD> findById(long id);
    Iterable<CD> findAll();
    void deleteById(long id);
    void delete(CD cd);
    long count();
    Iterable<CD> findAllById(Iterable<Long> id);
}

package repositories;

import entities.CD;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CDRepository extends CrudRepository<CD, Long> {
    CD save(CD cd);
    Optional<CD> findById(long id);
}

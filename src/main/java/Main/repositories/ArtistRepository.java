package Main.repositories;

import Main.entities.Artist;
import Main.entities.CD;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
    Artist save(Artist artist);
    Optional<Artist> findById(long id);

    Iterable<Artist> findAll();
    void deleteById(long id);
    void delete(Artist artist);

    long count();
    Iterable<Artist> findAllById(Iterable<Long> id);

}

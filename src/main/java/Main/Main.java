package Main;

import Main.entities.Artist;
import Main.entities.CD;
import Main.repositories.ArtistRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import Main.repositories.CDRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(ArtistRepository repository) {
        return args -> {

            List<Artist> allArtists = (List<Artist>) repository.findAll();

            for (Artist artist : allArtists) {
                System.out.println(artist.getName());
            }

        };
    }
}

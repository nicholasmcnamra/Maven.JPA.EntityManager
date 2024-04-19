package Main;

import entities.CD;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import repositories.CDRepository;

import java.util.Optional;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CDRepository repository) {
        return args -> {

            repository.save(new CD("Hadsel", "Rock", 2023, "Beirut", 20.00));


            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            repository.findAll().forEach(customer -> {
                log.info(customer.toString());
            });
            log.info("");

            // fetch an individual customer by ID
            Optional<CD> cd = repository.findById(1L);
            log.info("entities.CD found with findById(1L):");
            log.info("--------------------------------");
            log.info(cd.toString());
            log.info("");
        };
    }
}

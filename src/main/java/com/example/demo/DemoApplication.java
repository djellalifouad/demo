package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    ClientDetailRepository clientDetailRepository;
    @Autowired
    CompteRepository compteRepository;


    @Override
    public void run(String... args) throws Exception {
       Collection<Compte> comptes = new ArrayList<>();

        Client client = new Client( Long.parseLong("1") , comptes);
        Client client2 = new Client( Long.parseLong("2") , comptes);
        Client client3 = new Client( Long.parseLong("2") , comptes);
       clientRepository.save(client);
       clientRepository.save(client2);
    }
}

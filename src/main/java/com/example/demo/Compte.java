package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Compte {
    @Id
    private Long idCompte;
    private String login;
    private String password;
    @ManyToOne
    @JoinColumn(name="idClient")
    private Client client;
}

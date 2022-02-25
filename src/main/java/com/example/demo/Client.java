package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    @Id
    private Long idClient;
    private String nom;

    @ToString.Exclude
   @OneToMany(mappedBy = "client")
   private Collection<Compte> LesComptes;

}

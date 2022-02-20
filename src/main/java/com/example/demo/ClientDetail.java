package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class ClientDetail {
     @Id
     private Long idClientDetail;
     private String description;
        @OneToOne
     private Client client;


}

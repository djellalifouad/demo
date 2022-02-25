package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {


    List<Client> findClientBynom(String s);
    @Query("select c.nom from Client c where c.nom like %:name%")
    List<String> findClientBynameLike(@Param("name") String s);

}

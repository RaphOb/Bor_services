package com.devoteam.presales.testspringsecu;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DevoRepository extends CrudRepository<Devo, Integer> {

    @Query("SELECT DISTINCT devoentity FROM Devo")
    List<Devo> findAllEntity();

    @Query("SELECT DISTINCT Secteur FROM Devo")
    List<Devo> findAllSecteur();
}

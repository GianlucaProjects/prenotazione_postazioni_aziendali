package org.example.daos;

import org.example.entities.Edificio;

import java.util.List;

public interface EdificioDao {
    Edificio save(Edificio edificio);
    Edificio findById(Long id);
    List<Edificio> findAll();
    void delete(Long id);
}


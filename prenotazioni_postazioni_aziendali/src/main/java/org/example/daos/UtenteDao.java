package org.example.daos;

import org.example.entities.Utente;

import java.util.List;

public interface UtenteDao {
    Utente save(Utente utente);
    Utente findByUsername(String username);
    List<Utente> findAll();
    void delete(String username);
}

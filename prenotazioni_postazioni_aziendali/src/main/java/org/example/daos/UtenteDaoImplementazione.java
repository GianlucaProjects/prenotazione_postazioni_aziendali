package org.example.daos;

import org.example.entities.Utente;
import org.example.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UtenteDaoImplementazione implements UtenteDao {

    @Autowired
    private UtenteRepository utenteRepository;

    @Override
    public Utente save(Utente utente) {
        return utenteRepository.save(utente);
    }

    @Override
    public Utente findByUsername(String username) {
        return utenteRepository.findById(username).orElse(null);
    }

    @Override
    public List<Utente> findAll() {
        return utenteRepository.findAll();
    }

    @Override
    public void delete(String username) {
        utenteRepository.deleteById(username);
    }
}

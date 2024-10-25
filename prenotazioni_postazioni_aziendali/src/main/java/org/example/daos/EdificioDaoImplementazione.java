package org.example.daos;

import org.example.entities.Edificio;
import org.example.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EdificioDaoImplementazione implements EdificioDao {

    @Autowired
    private EdificioRepository edificioRepository;

    @Override
    public Edificio save(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public Edificio findById(Long id) {
        return edificioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Edificio> findAll() {
        return edificioRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        edificioRepository.deleteById(id);
    }
}


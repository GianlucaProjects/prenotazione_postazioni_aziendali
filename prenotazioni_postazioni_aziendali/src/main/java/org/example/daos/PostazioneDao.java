package org.example.daos;

import org.example.entities.Postazione;
import org.example.utils.TipoPostazione;

import java.util.List;

public interface PostazioneDao {
    Postazione save(Postazione postazione);
    Postazione findById(Long id);
    List<Postazione> findAll();
    void delete(Long id);
    List<Postazione> findByTipoAndCitta(TipoPostazione tipo, String citta);
}

package org.example.daos;

import org.example.entities.Prenotazione;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneDao {
    Prenotazione save(Prenotazione prenotazione);
    Prenotazione findById(Long id);
    List<Prenotazione> findAll();
    void delete(Long id);
    boolean existsByUtenteAndData(String username, LocalDate data);
    boolean existsByPostazioneAndData(Long postazioneId, LocalDate data);
}


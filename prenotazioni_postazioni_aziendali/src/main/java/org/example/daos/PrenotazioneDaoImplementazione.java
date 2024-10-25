package org.example.daos;

import org.example.entities.Prenotazione;
import org.example.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class PrenotazioneDaoImplementazione implements PrenotazioneDao {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Override
    public Prenotazione save(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    @Override
    public Prenotazione findById(Long id) {
        return prenotazioneRepository.findById(id).orElse(null);
    }

    @Override
    public List<Prenotazione> findAll() {
        return prenotazioneRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        prenotazioneRepository.deleteById(id);
    }

    @Override
    public boolean existsByUtenteAndData(String username, LocalDate data) {
        return prenotazioneRepository.existsByUtente_UsernameAndData(username, data);
    }

    @Override
    public boolean existsByPostazioneAndData(Long postazioneId, LocalDate data) {
        return prenotazioneRepository.existsByPostazione_IdAndData(postazioneId, data);
    }
}


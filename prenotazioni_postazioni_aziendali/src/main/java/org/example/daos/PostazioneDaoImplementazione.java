package org.example.daos;

import org.example.entities.Postazione;
import org.example.repositories.PostazioneRepository;
import org.example.utils.TipoPostazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostazioneDaoImplementazione implements PostazioneDao {

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Override
    public Postazione save(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }

    @Override
    public Postazione findById(Long id) {
        return postazioneRepository.findById(id).orElse(null);
    }

    @Override
    public List<Postazione> findAll() {
        return postazioneRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        postazioneRepository.deleteById(id);
    }

    @Override
    public List<Postazione> findByTipoAndCitta(TipoPostazione tipo, String citta) {
        return postazioneRepository.findByTipoAndEdificio_Citta(tipo, citta);
    }
}


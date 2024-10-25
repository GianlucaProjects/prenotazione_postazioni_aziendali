package org.example.repositories;

import org.example.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    // qui, documentandomi meglio sugli argomenti visti a lezione, ho creato dei metodi
    // che, scritti in questa maniera e con questi argomenti come input, generano
    // automaticamente le query

    List<Prenotazione> findByUtente_Username(String username);
    boolean existsByUtente_UsernameAndData(String username, LocalDate data);
    boolean existsByPostazione_IdAndData(Long postazioneId, LocalDate data);
}

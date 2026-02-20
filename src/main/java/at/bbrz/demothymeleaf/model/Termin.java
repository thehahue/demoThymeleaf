package at.bbrz.demothymeleaf.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Termin {
    private Long id;
    private String titel;
    private String teilnehmer;
    private String notiz;
    private LocalDate datum;
    private LocalTime urzeit;

    public Termin(Long id, String titel, String teilnehmer, String notiz, LocalDate datum, LocalTime urzeit) {
        this.id = id;
        this.titel = titel;
        this.teilnehmer = teilnehmer;
        this.notiz = notiz;
        this.datum = datum;
        this.urzeit = urzeit;
    }

    public Long getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public String getTeilnehmer() {
        return teilnehmer;
    }

    public String getNotiz() {
        return notiz;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public LocalTime getUrzeit() {
        return urzeit;
    }
}

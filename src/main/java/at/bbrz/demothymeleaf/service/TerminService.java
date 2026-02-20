package at.bbrz.demothymeleaf.service;

import at.bbrz.demothymeleaf.model.Termin;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TerminService {

    public List<Termin> findAll() {
        List<Termin> termine=new ArrayList<>();
        termine.add(new Termin(1L, "Test", "Ich", "Notiz", LocalDate.now(), LocalTime.now()));
        termine.add(new Termin(2L, "Java", "Alle und mehr", "main()", LocalDate.now(), LocalTime.now()));

        return termine;
    }
}

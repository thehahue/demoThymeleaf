package at.bbrz.demothymeleaf.controller;

import at.bbrz.demothymeleaf.model.Termin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Controller

public class TerminController {

    @GetMapping("/")
    public String termine(Model model) {
        List<Termin> termine=new ArrayList<>();
        termine.add(new Termin(1L, "Test", "Ich", "Notiz", LocalDate.now(), LocalTime.now()));
        termine.add(new Termin(2L, "Java", "Alle und mehr", "main()", LocalDate.now(), LocalTime.now()));
        model.addAttribute("termine", termine);

        return "termine";
    }
}

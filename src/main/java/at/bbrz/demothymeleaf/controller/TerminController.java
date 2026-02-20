package at.bbrz.demothymeleaf.controller;

import at.bbrz.demothymeleaf.service.TerminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TerminController {
    @Autowired
    private TerminService terminService;

    @GetMapping("/")
    public String termine(Model model) {
        model.addAttribute("termine", terminService.findAll());
        model.addAttribute("headText", "Termin Service");

        return "termine";
    }
}

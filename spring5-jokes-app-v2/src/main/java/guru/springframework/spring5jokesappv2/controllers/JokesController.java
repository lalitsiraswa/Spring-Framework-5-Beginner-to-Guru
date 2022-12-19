package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    // Autowired is optional in Constructor
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }
    @GetMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}

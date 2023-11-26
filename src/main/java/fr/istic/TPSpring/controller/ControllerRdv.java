package fr.istic.TPSpring.controller;


import fr.istic.TPSpring.Services.RdvService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rdv")
public class ControllerRdv {
    private RdvService rdvService;
}

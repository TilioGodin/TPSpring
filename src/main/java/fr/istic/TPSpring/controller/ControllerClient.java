package fr.istic.TPSpring.controller;

import fr.istic.TPSpring.Services.ClientService;
import fr.istic.TPSpring.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ControllerClient {
    @Autowired
    private ClientService clientService;

    // Requete get
    @GetMapping("/{clientId}")
    public ResponseEntity getClientId(@PathVariable String clientId) {
        Client client = clientService.getClient(clientId);
        if (client != null) {
            return new ResponseEntity<>(client, HttpStatus.OK);
        }
        return new ResponseEntity<>(client, HttpStatus.NOT_FOUND);

    }
}

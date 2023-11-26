package fr.istic.TPSpring.Services;

import fr.istic.TPSpring.model.Client;
import fr.istic.TPSpring.repository.IClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ClientService {
    private IClient iClient;

    public Client getClient(String clientId) {
        if (iClient.findById(clientId).isPresent()) {
            return iClient.getById(clientId);

        }
        return null;
    }
}

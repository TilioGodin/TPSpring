package fr.istic.TPSpring.repository;

import fr.istic.TPSpring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClient extends JpaRepository {
    Client getById(String id);
}

package fr.istic.TPSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class RDV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idRDV;

    @ManyToOne
    private Client client;
    @ManyToOne
    private Pro pro;

    private String date;
    private Status status;

}

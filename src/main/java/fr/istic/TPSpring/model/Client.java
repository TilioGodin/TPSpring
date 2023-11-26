package fr.istic.TPSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Client extends User {
    private String numSecu;
    @OneToMany(mappedBy = "client")
    private List<RDV> rdvList;

}

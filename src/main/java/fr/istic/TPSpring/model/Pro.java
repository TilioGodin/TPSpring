package fr.istic.TPSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Pro extends User {
    private Profession profession;
    
    @OneToMany(mappedBy = "pro")
    private List<RDV> rdvList;
}

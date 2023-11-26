package fr.istic.TPSpring.Services;

import fr.istic.TPSpring.repository.IRdv;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RdvService {
    private IRdv iRdv;
}

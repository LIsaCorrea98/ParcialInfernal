package co.edu.ufps.services;

import co.edu.ufps.entities.Inscripcion;
import co.edu.ufps.repositories.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscripcionService {

    @Autowired
    private InscripcionRepository inscripcionRepository;

    public List<Inscripcion> getInscripcionesByProgramacion(Integer programacionId) {
        return inscripcionRepository.findByProgramacionId(programacionId);
    }

    public Inscripcion createInscripcion(Inscripcion inscripcion) {
        return inscripcionRepository.save(inscripcion);
    }
}

package co.edu.ufps.controller;

import co.edu.ufps.entities.Inscripcion;
import co.edu.ufps.services.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscripciones")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @GetMapping("/{programacionId}")
    public List<Inscripcion> getInscripcionesByProgramacion(@PathVariable Integer programacionId) {
        return inscripcionService.getInscripcionesByProgramacion(programacionId);
    }

    @PostMapping
    public ResponseEntity<Inscripcion> createInscripcion(@RequestBody Inscripcion inscripcion) {
        Inscripcion newInscripcion = inscripcionService.createInscripcion(inscripcion);
        return ResponseEntity.ok(newInscripcion);
    }
}

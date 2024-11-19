package co.edu.ufps.controller;



import co.edu.ufps.entities.Taller;
import co.edu.ufps.services.TallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/talleres")
public class TallerController {

    @Autowired
    private TallerService tallerService;

    // GET: Listar talleres
    @GetMapping
    public List<Taller> getAllTalleres() {
        return tallerService.getAllTalleres();
    }

    // POST: Crear nuevo taller
    @PostMapping
    public ResponseEntity<Taller> createTaller(@RequestBody Taller taller) {
        Taller createdTaller = tallerService.saveTaller(taller);
        return ResponseEntity.ok(createdTaller);
    }

    // PUT: Actualizar un taller
    @PutMapping("/{id}")
    public ResponseEntity<Taller> updateTaller(@PathVariable Integer id, @RequestBody Taller tallerDetails) {
        Taller updatedTaller = tallerService.updateTaller(id, tallerDetails);
        if (updatedTaller != null) {
            return ResponseEntity.ok(updatedTaller);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE: Eliminar un taller
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaller(@PathVariable Integer id) {
        if (tallerService.deleteTaller(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

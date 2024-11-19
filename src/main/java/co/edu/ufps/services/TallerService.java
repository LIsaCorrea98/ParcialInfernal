package co.edu.ufps.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.entities.Taller;
import co.edu.ufps.repositories.TallerRepository;

@Service
public class TallerService {
	@Autowired
	private TallerRepository tallerRepository;
	
	public List<Taller> getAllTalleres(){
		return tallerRepository.findAll();
	}

	public Taller saveTaller(Taller taller) {
        return tallerRepository.save(taller);
    }

    // Actualizar un taller existente
    public Taller updateTaller(Integer id, Taller tallerDetails) {
        Optional<Taller> optionalTaller = tallerRepository.findById(id);
        if (optionalTaller.isPresent()) {
            Taller taller = optionalTaller.get();
            taller.setNombre(tallerDetails.getNombre());
            taller.setDescripcion(tallerDetails.getDescripcion());
            return tallerRepository.save(taller);
        }
        return null; // O lanza una excepción si prefieres manejarlo así
    }

    // Eliminar un taller
    public boolean deleteTaller(Integer id) {
        if (tallerRepository.existsById(id)) {
            tallerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}



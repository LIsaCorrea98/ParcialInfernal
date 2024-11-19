package co.edu.ufps.services;

import co.edu.ufps.entities.Instructor;
import co.edu.ufps.repositories.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public Instructor updateInstructor(Integer id, Instructor instructorDetails) {
        Optional<Instructor> optionalInstructor = instructorRepository.findById(id);
        if (optionalInstructor.isPresent()) {
            Instructor instructor = optionalInstructor.get();
            instructor.setNombre(instructorDetails.getNombre());
            instructor.setDocumento(instructorDetails.getDocumento());
            return instructorRepository.save(instructor);
        }
        return null;
    }

    public boolean deleteInstructor(Integer id) {
        if (instructorRepository.existsById(id)) {
            instructorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

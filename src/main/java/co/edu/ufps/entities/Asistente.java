package co.edu.ufps.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "asistente", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"sesion_id", "participante_id"})
})
public class Asistente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "sesion_id", nullable = false)
    private Sesion sesion;

    @ManyToOne
    @JoinColumn(name = "participante_id", nullable = false)
    private Participante participante;
}

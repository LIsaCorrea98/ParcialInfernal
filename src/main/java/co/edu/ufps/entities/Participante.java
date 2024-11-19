package co.edu.ufps.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 200, nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "colegio_id")
    private Colegio colegio;

    @Column(name = "tipo_documento_id")
    private Integer tipoDocumentoId;
}

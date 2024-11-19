package co.edu.ufps.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "programacion")
public class Programacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "colegio_id")
    private Colegio colegio;

    @ManyToOne
    @JoinColumn(name = "taller_id")
    private Taller taller;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "observación", columnDefinition = "TEXT")
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @Column(name = "grado")
    private Integer grado;

    @Column(name = "grupo", length = 50)
    private String grupo;

    @Column(name = "ubicacion_id")
    private Integer ubicacionId;
}

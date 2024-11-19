package co.edu.ufps.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


	@Data
	@Entity
	@Table(name="Colegios")
	public class Colegio {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private int id;

	    @Column(name="nombre", length=100, nullable=false)
	    private String nombre;
	    
	    @ManyToOne
	    @JoinColumn(name = "municipio_id")
	    private Municipio municipio;
	    
	    @Column(name = "dane", length = 50)
	    private String dane;
	    
}

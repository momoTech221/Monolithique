package sn.mairie.monolithique.entities;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor @AllArgsConstructor @ToString
@Entity
@Table(name = "registres")
public class Registre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private Boolean active;
	private String annee;
	@OneToMany(mappedBy = "registre")
	private Collection<DeclarationNaissance> declarationissance;
	
}

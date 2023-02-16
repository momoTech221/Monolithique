package sn.mairie.monolithique.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
@Table(name = "declarants")
public class Declarant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String CIN;
	private String adresse;
	private Date dateNaissance;
	private String lieuNaissance;
	private String degreParental;
	@OneToMany(mappedBy = "declarant")
	private Collection<DeclarationNaissance>declarationNaissance;
}

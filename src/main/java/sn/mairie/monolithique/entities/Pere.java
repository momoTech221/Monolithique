package sn.mairie.monolithique.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="peres")
@Data
@NoArgsConstructor @AllArgsConstructor @ToString

public class Pere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 30, name="nom")
	private String nom;
	private String prenom;
	@NotNull
	@Size(max=16)
	private String CIN;
	private String profession;
	private String adresse;
	@Temporal(TemporalType.DATE)
	private Date dateNaiss;
	private String lieuNaiss;
	@OneToMany(mappedBy = ("pere"))
	private Collection<DeclarationNaissance> declarationNaissance;
}

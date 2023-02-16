package sn.mairie.monolithique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolithique.entities.DeclarationNaissance;


public interface DeclarationNaissanceRepository extends JpaRepository<DeclarationNaissance, Long> {

}

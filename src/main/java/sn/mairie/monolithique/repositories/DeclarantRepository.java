package sn.mairie.monolithique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolithique.entities.Declarant;

public interface DeclarantRepository extends JpaRepository<Declarant, Long> {

}

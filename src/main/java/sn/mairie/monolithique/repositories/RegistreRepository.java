package sn.mairie.monolithique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolithique.entities.Registre;

public interface RegistreRepository extends JpaRepository<Registre, Long> {

}

package sn.mairie.monolithique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolithique.entities.Jugement;

public interface JugementRepository extends JpaRepository<Jugement, Long>{

}

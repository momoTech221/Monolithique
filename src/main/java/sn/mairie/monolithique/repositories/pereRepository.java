package sn.mairie.monolithique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolithique.entities.Pere;

public interface pereRepository extends JpaRepository<Pere, Long> {
	
}

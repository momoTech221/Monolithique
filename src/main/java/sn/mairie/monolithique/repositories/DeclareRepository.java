package sn.mairie.monolithique.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolithique.entities.Declare;

public interface DeclareRepository extends JpaRepository<Declare, Long> {

}

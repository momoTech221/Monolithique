package sn.mairie.monolithique;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.mairie.monolithique.entities.Pere;
import sn.mairie.monolithique.repositories.pereRepository;

@SpringBootApplication
public class ProjectMairieMvcApplication implements CommandLineRunner {
	//Injection de dependances ie permet d'accer a la table pere apartir l'interface pereRepository
	@Autowired
	private pereRepository pereRepository;
	
	
	public static void main(String[] args) {
		//Executer l'application
		SpringApplication.run(ProjectMairieMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Pere pere=pereRepository.save(new Pere(null,"Niang","Yero","20170777","Ingenieur","Goumel",new Date(),"Kolda"));
//		Pere pere1=pereRepository.save(new Pere(null,"SAGNA","Moussa","20170777","Ingenieur","Goumel",new Date(),"Kolda"));
//		
//		pereRepository.findAll().forEach(p->{
//			System.out.println(p.toString());
//		});
	}
	
	
}

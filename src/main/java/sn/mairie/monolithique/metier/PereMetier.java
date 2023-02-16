package sn.mairie.monolithique.metier;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NoArgsConstructor;
import sn.mairie.monolithique.entities.Pere;
import sn.mairie.monolithique.repositories.pereRepository;

@Service
@Data 
public class PereMetier implements IPereMetier{

	@Autowired
	private pereRepository pereRepository;
	
	@Override
	public Pere savePere(Pere p) {
		// TODO Auto-generated method stub
		return pereRepository.save(p);
	}
	
	public List<Pere> listPeres(){
		return pereRepository.findAll();
	}
	
	public Pere editPere(Pere p,long id) {
		Pere pp = pereRepository.findById(id).get();
		if(pp != null) {
			if(p.getNom() != null) {
				
			}
		}
		return p;
		
	}

}

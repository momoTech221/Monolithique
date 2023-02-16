package sn.mairie.monolithique.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sn.mairie.monolithique.entities.Pere;
import sn.mairie.monolithique.metier.IPereMetier;

@RestController
public class PereController {

	
	@Autowired
	private IPereMetier pereMetier;
	
	
	//faire un clic droit sur pereMetier +source+ generate Dalegate Methode
	//qui va generer les les methodes savePere()et listPeres()
	
	@RequestMapping(value = "/peres",method = RequestMethod.POST)
	public Pere savePere(@RequestBody @Valid Pere p) {
		return pereMetier.savePere(p);
	}
	@RequestMapping(value = "/peres111",method = RequestMethod.GET)
	public List<Pere> listPeres() {
		return pereMetier.listPeres();
	}
}

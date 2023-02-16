package sn.mairie.monolithique.metier;

import java.util.List;
import sn.mairie.monolithique.entities.Pere;

public interface IPereMetier {
	public Pere savePere(Pere p);
	
	public List<Pere> listPeres();
	
}

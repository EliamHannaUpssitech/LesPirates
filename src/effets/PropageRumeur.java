package effets;

import cartes.Carte;
import cartes.Effet;
import jeu.Joueur;

public class PropageRumeur extends Carte {

	public PropageRumeur(Effet effet) {
		super(effet);
	}
	
	@Override
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurAdv.affectPopularite(-1);
	}
	
	@Override
	public void removeEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurAdv.affectPopularite(1);
	}
}

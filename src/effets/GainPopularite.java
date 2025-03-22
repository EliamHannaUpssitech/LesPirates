package effets;

import cartes.Carte;
import cartes.Effet;
import jeu.Joueur;

public class GainPopularite extends Carte {

	public GainPopularite(Effet effet) {
		super(effet);
	}
	
	@Override
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurUtil.affectPopularite(1);
	}
	
	@Override
	public void removeEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurUtil.affectPopularite(-1);
	}
}

package effets;

import cartes.Carte;
import cartes.Effet;
import jeu.Joueur;

public class PopulariteUltime extends Carte {

	public PopulariteUltime(Effet effet) {
		super(effet);
	}
	
	@Override
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurUtil.affectPopularite(2);
	}
	
	@Override
	public void removeEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurUtil.affectPopularite(-2);
	}
}

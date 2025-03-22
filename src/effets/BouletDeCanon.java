package effets;

import cartes.Carte;
import cartes.Effet;
import jeu.Joueur;

public class BouletDeCanon extends Carte {

	public BouletDeCanon(Effet effet) {
		super(effet);
	}
	
	@Override
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurAdv.affectVie(-2);
	}
	
	@Override
	public void removeEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurAdv.affectVie(2);
	}
}

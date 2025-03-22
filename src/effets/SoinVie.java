package effets;

import cartes.Carte;
import cartes.Effet;
import jeu.Joueur;

public class SoinVie extends Carte {

	public SoinVie(Effet effet) {
		super(effet);
	}
	
	@Override
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurUtil.affectVie(1);
	}
	
	@Override
	public void removeEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurUtil.affectVie(-1);
	}
}

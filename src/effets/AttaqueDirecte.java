package effets;

import cartes.Carte;
import cartes.Effet;
import jeu.Joueur;

public class AttaqueDirecte extends Carte {

	public AttaqueDirecte(Effet effet) {
		super(effet);
	}
	
	@Override
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurAdv.affectVie(-1);
	}
}

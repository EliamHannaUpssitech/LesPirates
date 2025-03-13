package effets;

import cartes.Carte;
import cartes.Effet;
import jeu.Joueur;

public class Omnicience extends Carte {

	public Omnicience(Effet effet) {
		super(effet);
	}
	
	@Override
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		joueurAdv.afficheMain();
	}
}

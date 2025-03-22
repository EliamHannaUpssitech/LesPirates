package effets;

import java.util.Random;

import cartes.Carte;
import cartes.Effet;
import jeu.Joueur;

public class Roulette extends Carte {

	public Roulette(Effet effet) {
		super(effet);
	}
	
	@Override
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		Random rand = new Random();
		Boolean choix = rand.nextBoolean();
		if(choix == true) {
			joueurUtil.affectVie(-2);
		}else {
			joueurUtil.affectPopularite(2);
		}
	}
	
	@Override
	public void removeEffet(Joueur joueurUtil, Joueur joueurAdv) {
		System.out.println("Rien ne remplace la chance");
	}
}

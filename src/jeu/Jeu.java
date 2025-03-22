package jeu;

import cartes.Pioche;

public class Jeu {
	public static void main(String[] args) {

		Pioche pioche = new Pioche();

		Afficheur afficheur = new Afficheur();
		Joueur gagnant;
		
		afficheur.afficherContexte();
		afficheur.afficherRegles();
		
		Joueur joueur1 = new Joueur(afficheur.nomJoueur(1), pioche);
		Joueur joueur2 = new Joueur(afficheur.nomJoueur(2), pioche);
		
		afficheur.afficherDebut(joueur1, joueur2);
		
		int tour = 0;

		while(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPopularite() < 5 && joueur2.getPopularite() < 5) {
			tour = afficheur.whichTurn(tour);
			
			afficheur.joueurJoue(pioche, joueur1);
			afficheur.joueurAdv(joueur2);
			afficheur.utilisationCarte(joueur1, joueur2);
	
			if(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPopularite() < 5 && joueur2.getPopularite() < 5) {
				afficheur.joueurJoue(pioche, joueur2);
				afficheur.joueurAdv(joueur1);
				afficheur.utilisationCarte(joueur2, joueur1);
			}
		}
		
		if(joueur1.getVie() <= 0 || joueur2.getPopularite() >= 5) {
			gagnant = joueur2;
		}else {
			gagnant = joueur1;
		}
		
		pioche.afficherPioche();
		
		afficheur.afficheJeu(joueur1, joueur2);
		
		afficheur.gagnant(gagnant);
	}
}

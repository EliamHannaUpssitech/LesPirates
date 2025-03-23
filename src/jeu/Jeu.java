package jeu;

import java.util.Scanner;

import cartes.Carte;
import cartes.Pioche;

public class Jeu implements Afficheur {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		Pioche pioche = new Pioche();

		Joueur gagnant;
		
		int choixCarte;
		int choixBanc;
		Carte carteUtilisee;
		
		Afficheur.afficherContexte();
		Afficheur.afficherRegles();
		
		Afficheur.nomJoueur(1);
		Joueur joueur1 = new Joueur(scanner.nextLine(), pioche);
		Afficheur.nomJoueur(2);
		Joueur joueur2 = new Joueur(scanner.nextLine(), pioche);
		
		Afficheur.afficherDebut(joueur1, joueur2);
		
		int tour = 0;

		while(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPopularite() < 5 && joueur2.getPopularite() < 5) {
			tour++;
			Afficheur.whichTurn(tour);
			
			Afficheur.joueurJoue(pioche, joueur1);
			Afficheur.joueurAdv(joueur2);
			choixCarte = 0;
			while(choixCarte<1 || choixCarte>5) {
				Afficheur.choixCarte(joueur1);
				choixCarte = scanner.nextInt();
			}
			carteUtilisee = joueur1.choixCarte(choixCarte-1);
			
			choixBanc = 0;
			while(choixBanc<1 || choixBanc>5) {
				Afficheur.choixBanc();
				choixBanc = scanner.nextInt();
			}
			joueur1.jouerCarte(carteUtilisee, choixBanc, joueur1, joueur2);
			
			Afficheur.effetApplique(carteUtilisee);
	
			if(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPopularite() < 5 && joueur2.getPopularite() < 5) {
				Afficheur.joueurJoue(pioche, joueur2);
				Afficheur.joueurAdv(joueur1);
				choixCarte = 0;
				while(choixCarte<1 || choixCarte>5) {
					Afficheur.choixCarte(joueur2);
					choixCarte = scanner.nextInt();
				}
				carteUtilisee = joueur2.choixCarte(choixCarte-1);
				
				choixBanc = 0;
				while(choixBanc<1 || choixBanc>5) {
					Afficheur.choixBanc();
					choixBanc = scanner.nextInt();
				}
				joueur2.jouerCarte(carteUtilisee, choixBanc, joueur2, joueur1);
				
				Afficheur.effetApplique(carteUtilisee);
			}
		}
		
		if(joueur1.getVie() <= 0 || joueur2.getPopularite() >= 5) {
			gagnant = joueur2;
		}else {
			gagnant = joueur1;
		}
		
		Afficheur.afficherPioche(pioche);
		
		Afficheur.afficheJeu(joueur1, joueur2);
		
		Afficheur.gagnant(gagnant);
	}
}

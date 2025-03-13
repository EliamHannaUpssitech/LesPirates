package jeu;

import java.util.Scanner;

import cartes.Banc;
import cartes.Carte;
import cartes.Main;
import cartes.Pioche;

public class Afficheur {
	private static Scanner scanner = new Scanner(System.in);
	
	public void afficherContexte() {
		System.out.println("CONTEXTE : ");
		System.out.println("\tBonjour cher joueurs, je serais votre narrateur pour cette aventure. En l'an 1700, le monde traverse ");
		System.out.println("\tune periode trouble,les grandes puissances navales s'effondrent sous le poids des guerres et des revoltes ");
		System.out.println("\tlaissant place a une nouvelle ere,celle des pirates. Les plus grandes mers sont divisees et controlees ");
		System.out.println("\tpar les deux plus grands pirates jamais connus.");
	}
	
	public void afficherRegles() {
		System.out.println("REGLES : ");
		System.out.println("\tChaque joueur debute avec 4 cartes, lors de son tour le joueur pioche une carte de la pioche et ");
		System.out.println("\tl'ajoute à sa main. Il utilise ensuite une de ces 5 cartes et active son effet avant de finir son tour ");
		System.out.println("\t(l'utilisation d'une carte est obligatoire pour passer le tour). Le tour passe ensuite à celui de l'adversaire.");
	}
	
	public String nomJoueur(int nbJoueur) {
		System.out.print("Donnez le nom du pirate " + nbJoueur + " : ");
		String nom = scanner.nextLine();
		return nom;
	}
	
	public void afficherDebut(Joueur joueur1, Joueur joueur2) {
		System.out.println("\nLe pirate " + joueur1.getNom() + " affrontera le pirate " + joueur2.getNom() + ".");
	}
	
	public int whichTurn(int turn) {
		turn++;
		System.out.println("\n----------------------------------------");
		System.out.println("\n\tTour : " + turn);
		return turn;
	}
	
	public void joueurJoue(Pioche pioche, Joueur joueur) {
		joueur.piocher(pioche);
		System.out.print("\n");
		System.out.println("VOUS :");
		System.out.println(joueur.getNom() + " : " + joueur.getVie() + " HP | " + joueur.getPopularite() + " Popularité");
		joueur.afficheBanc();
		joueur.afficheMain();
	}

	public void joueurAdv(Joueur joueur) {
		System.out.print("\n");
		System.out.println("ADVERSAIRE :");
		System.out.println(joueur.getNom() + " : " + joueur.getVie() + " HP | " + joueur.getPopularite() + " Popularité");
		joueur.afficheBanc();
	}
	
	public void utilisationCarte(Joueur joueurUtil, Joueur joueurAdv) {
		System.out.print("\n");
		System.out.print(joueurUtil.getNom() + ", choisissez une carte à utiliser de votre main : ");
		int choixCarte = scanner.nextInt();
		Carte carteUtilisee = joueurUtil.choixCarte(choixCarte-1);
		System.out.println("L'effet " + carteUtilisee.getNom() + " à été appliqué.");
		carteUtilisee.affectEffet(joueurUtil, joueurAdv);
	}
	
	public void gagnant(Joueur gagnant) {
		System.out.println("\nLe gagnant est le pirate " + gagnant.getNom() + " !!");
	}
	
	public void afficheJeu(Joueur joueur1, Joueur joueur2) {
		System.out.println("\n----------------------------------------\n");
		System.out.println(joueur1.getNom() + " : " + joueur1.getVie() + " HP | " + joueur1.getPopularite() + " Popularité");
		joueur1.afficheBanc();
		joueur1.afficheMain();
		
		System.out.print("\n");
		System.out.println(joueur2.getNom() + " : " + joueur2.getVie() + " HP | " + joueur2.getPopularite() + " Popularité");
		joueur2.afficheBanc();
		joueur2.afficheMain();
	}

	public static void main(String[] args) {

		Pioche pioche = new Pioche();

		Afficheur afficheur = new Afficheur();
		Joueur gagnant;
		
		afficheur.afficherContexte();
		afficheur.afficherRegles();
		
		Main mainj1 = new Main(pioche);
		Banc bancj1 = new Banc();
		Joueur joueur1 = new Joueur(afficheur.nomJoueur(1), mainj1, bancj1);
		
		Main mainj2 = new Main(pioche);
		Banc bancj2 = new Banc();
		Joueur joueur2 = new Joueur(afficheur.nomJoueur(2), mainj2, bancj2);
		
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

package jeu;

import java.util.Scanner;

import cartes.Carte;
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
		System.out.print(joueur.afficheBanc());
		System.out.print(joueur.afficheMain());
	}

	public void joueurAdv(Joueur joueur) {
		System.out.print("\n");
		System.out.println("ADVERSAIRE :");
		System.out.println(joueur.getNom() + " : " + joueur.getVie() + " HP | " + joueur.getPopularite() + " Popularité");
		System.out.print(joueur.afficheBanc());
	}
	
	public void utilisationCarte(Joueur joueurUtil, Joueur joueurAdv) {
		System.out.print("\n");
		
		
		System.out.print(joueurUtil.getNom() + ", choisissez une carte à utiliser de votre main : ");
		int choixCarte = scanner.nextInt();
		Carte carteUtilisee = joueurUtil.choixCarte(choixCarte-1);
		
		System.out.print("Choisissez où jouer cette carte : ");
		int choixBanc = scanner.nextInt();
		joueurUtil.jouerCarte(carteUtilisee, choixBanc, joueurUtil, joueurAdv);
		
		
		System.out.println("L'effet " + carteUtilisee.getNom() + " à été appliqué.");
	}
	
	public void gagnant(Joueur gagnant) {
		System.out.println("\nLe gagnant est le pirate " + gagnant.getNom() + " !!");
	}
	
	public void afficheJeu(Joueur joueur1, Joueur joueur2) {
		System.out.println("\n----------------------------------------\n");
		System.out.println(joueur1.getNom() + " : " + joueur1.getVie() + " HP | " + joueur1.getPopularite() + " Popularité");
		System.out.print(joueur1.afficheBanc());
		System.out.print(joueur1.afficheMain());
		
		System.out.print("\n");
		System.out.println(joueur2.getNom() + " : " + joueur2.getVie() + " HP | " + joueur2.getPopularite() + " Popularité");
		System.out.print(joueur2.afficheBanc());
		System.out.print(joueur2.afficheMain());
	}
}

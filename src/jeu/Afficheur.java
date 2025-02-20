package jeu;

import java.util.Scanner;

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
	
	public void afficherDebut(String joueur1, String joueur2) {
		System.out.println("\nLe pirate " + joueur1 + " affrontera le pirate " + joueur2 + ".");
	}
	
	public int whichTurn(int turn) {
		turn++;
		System.out.println("\n\tTour : " + turn);
		return turn;
	}
	
	public void joueurJoue(String nom, int vie, int pop) {
		// joueur pioche une carte
		System.out.print("\n");
		System.out.println("VOUS :");
		System.out.println(nom + " : " + vie + " HP | " + pop + " Popularité");
		System.out.println("  Banc : 1.X | 2.X | 3.X | 4.X | 5.X");
		System.out.println("Main : 1.X | 2.X | 3.X | 4.X | 5.X");
	}

	public void joueurAdv(String nom, int vie, int pop) {
		System.out.print("\n");
		System.out.println("ADVERSAIRE :");
		System.out.println(nom + " : " + vie + " HP | " + pop + " Popularité");
		System.out.println("  Banc : 1.X | 2.X | 3.X | 4.X | 5.X");
	}
	
	public void utilisationCarte(String nom) {
		System.out.print("\n");
		System.out.print(nom + ", choisissez une carte à utiliser de votre main : ");
		int choixCarte = scanner.nextInt();
		// if(main[choixCarte] == passive) {
			System.out.print("Choisissez l'emplacement d'où mettre la carte : ");
			choixCarte = scanner.nextInt();
		// }
		// effetCarte
		String effet = "BOUM";
		System.out.println("L'effet " + effet + " à été appliqué.");
		// carte retirée de la main et ajoutée au banc/defausse
	}
	
	public void gagnant(String nom) {
		System.out.println("\nLe gagnant est le pirate " + nom + " !!");
	}

	public static void main(String[] args) {

		// création de la pioche (40 cartes)
		// création de la zone utilitaire

		Afficheur afficheur = new Afficheur();
		
		afficheur.afficherContexte();
		afficheur.afficherRegles();
		
		String j1nom = afficheur.nomJoueur(1);
		int j1vie = 5;
		int j1pop = 0;
		// création de la main joueur 1 & banc joueur 1
		// piocher 4 cartes dans la main joueur 1

		String j2nom = afficheur.nomJoueur(2);
		int j2vie = 5;
		int j2pop = 0;
		// création de la main joueur 2 & banc joueur 2
		// piocher 4 cartes dans la main joueur 1
		
		afficheur.afficherDebut(j1nom, j2nom);

		// while(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPopularite() < 5 && joueur2.getPopularite() < 5) {
			int tour = 0;
			tour = afficheur.whichTurn(tour);
			
			afficheur.joueurJoue(j1nom, j1vie, j1pop);
			afficheur.joueurAdv(j2nom, j2vie, j2pop);
			afficheur.utilisationCarte(j1nom);
	
			// if(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPopularite() < 5 && joueur2.getPopularite() < 5) {
			afficheur.joueurJoue(j1nom, j1vie, j1pop);
				afficheur.joueurAdv(j2nom, j2vie, j2pop);
				afficheur.utilisationCarte(j1nom);
			// }
		// }
		
		afficheur.gagnant(j2nom);
	}
}

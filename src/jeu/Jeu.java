package jeu;

import java.util.Scanner;

public class Jeu {
	private static Scanner scanner = new Scanner(System.in);

	private static String j1nom;
	private static int j1vie;
	private static int j1pop;

	private static String j2nom;
	private static int j2vie;
	private static int j2pop;

	private static int tour = 0;
	private static int choixCarte;
	private static int choixBanc;
	
	private static String effet = "BOUM";

	public static void main(String[] args) {

		// ADMIN création de la pioche (40 cartes)
		// ADMIN création de la zone utilitaire

		System.out.println("CONTEXTE : ");
		System.out.println("\tBonjour cher joueurs, je serais votre narrateur pour cette aventure. En l'an 1700, le monde traverse ");
		System.out.println("\tune periode trouble,les grandes puissances navales s'effondrent sous le poids des guerres et des revoltes ");
		System.out.println("\tlaissant place a une nouvelle ere,celle des pirates. Les plus grandes mers sont divisees et controlees ");
		System.out.println("\tpar les deux plus grands pirates jamais connus.");

		System.out.println("REGLES : ");
		System.out.println("\tChaque joueur debute avec 4 cartes, lors de son tour le joueur pioche une carte de la pioche et ");
		System.out.println("\tl'ajoute à sa main. Il utilise ensuite une de ces 5 cartes et active son effet avant de finir son tour ");
		System.out.println("\t(l'utilisation d'une carte est obligatoire pour passer le tour). Le tour passe ensuite à celui de l'adversaire.");

		System.out.print("Donnez le nom du pirate 1 : ");
		j1nom = scanner.nextLine();
		j1vie = 5;
		j1pop = 0;
		// ADMIN création de la main joueur 1 & banc joueur1
		// ADMIN piocher 4 cartes dans la main joueur 1

		System.out.print("Donnez le nom du pirate 2 : ");
		j2nom = scanner.nextLine();
		j2vie = 5;
		j2pop = 0;
		// ADMIN création de la main joueur 2 & banc joueur2
		// ADMIN piocher 4 cartes dans la main joueur 2

		System.out.println("Le pirate " + j1nom + " affrontera le pirate " + j2nom + ".");

		// while(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPopularite() < 5 && joueur2.getPopularite() < 5) {
			tour++;
			System.out.println("\tTour : " + tour);
			// ADMIN joueur1 pioche une carte et ajoute à sa main
			System.out.print("\n");
			System.out.println("VOUS :");
			System.out.println(j1nom + " : " + j1vie + " HP | " + j1pop + " Popularité");
			System.out.println("  Banc : 1.X | 2.X | 3.X | 4.X | 5.X");
			System.out.println("Main : 1.X | 2.X | 3.X | 4.X | 5.X");
			
			System.out.print("\n");
			System.out.println("ADVERSAIRE :");
			System.out.println(j2nom + " : " + j2vie + " HP | " + j2pop + " Popularité");
			System.out.println("  Banc : 1.X | 2.X | 3.X | 4.X | 5.X");
	
			System.out.print("\n");
			System.out.print(j1nom + ", choisissez une carte à utiliser de votre main : ");
			choixCarte = scanner.nextInt();
			
			// if(main[choixCarte] == passive) {
				System.out.print("Choisissez l'emplacement où mettre la carte : ");
				choixCarte = scanner.nextInt();
			// }
			// ADMIN effetCarte
			System.out.println("L'effet " + effet + " à été appliqué.");
			
			// if(joueur1.getVie() > 0 && joueur2.getVie() > 0 && joueur1.getPopularite() < 5 && joueur2.getPopularite() < 5) {
				// ADMIN joueur1 pioche une carte et ajoute à sa main
				System.out.print("\n");
				System.out.println("VOUS :");
				System.out.println(j2nom + " : " + j2vie + " HP | " + j2pop + " Popularité");
				System.out.println("  Banc : 1.X | 2.X | 3.X | 4.X | 5.X");
				System.out.println("Main : 1.X | 2.X | 3.X | 4.X | 5.X");
				
				System.out.print("\n");
				System.out.println("ADVERSAIRE :");
				System.out.println(j1nom + " : " + j1vie + " HP | " + j1pop + " Popularité");
				System.out.println("  Banc : 1.X | 2.X | 3.X | 4.X | 5.X");
				
				System.out.print("\n");
				System.out.print(j2nom + ", choisissez une carte à utiliser de votre main : ");
				choixCarte = scanner.nextInt();
				
				// if(main[choixCarte] == passive) {
					System.out.print("Choisissez l'emplacement où mettre la carte : ");
					choixCarte = scanner.nextInt();
				// }
				// ADMIN effetCarte
				System.out.println("L'effet " + effet + " à été appliqué.");
			// }
		// }
		String gagnant = j2nom;
		System.out.println("\nLe gagnant est le pirate " + gagnant + " !!");
	}
}

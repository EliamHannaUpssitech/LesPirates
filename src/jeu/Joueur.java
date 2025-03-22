package jeu;

import cartes.Banc;
import cartes.Carte;
import cartes.Main;
import cartes.Pioche;

public class Joueur {
	private String nom;
	private int vie;
	private int popularite;
	private Main main;
	private Banc banc;

	public Joueur(String nom, Pioche pioche) {
		this.nom = nom;
		vie = 5;
		popularite = 0;
		main = new Main(pioche);
		banc = new Banc();
	}

	public String getNom() {
		return nom;
	}

	public int getVie() {
		return vie;
	}

	public int getPopularite() {
		return popularite;
	}

	public void affectVie(int nombre) {
		vie += nombre;
	}

	public void affectPopularite(int nombre) {
		popularite += nombre;
	}
	
	public String afficheMain() {
		return main.afficheMain();
	}
	
	public String afficheBanc() {
		return banc.afficheBanc();
	}
	
	public Carte choixCarte(int index) {
		Carte carteUtil = main.getMain(index);
		main.jouerCarte(index);
		return carteUtil;
	}
	
	public void jouerCarte(Carte carte, int index, Joueur joueurUtil, Joueur joueurAdv) {
		banc.jouerCarte(carte, index, joueurUtil, joueurAdv);
	}
	
	public void piocher(Pioche pioche) {
		main.ajouterCarte(pioche.piocher());
	}
}

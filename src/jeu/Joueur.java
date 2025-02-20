package jeu;

import cartes.Carte;

public class Joueur {
	private String nom;
	private int vie;
	private int popularite;
	private Carte main[];
	private Carte banc[];

	public Joueur(String nom) {
		this.nom = nom;
		vie = 5;
		popularite = 0;
		Carte main[] = new Carte[5];
		for(int i=0; i<4; i++) {
			main[i].pioche();
		}
		Carte banc[] = new Carte[5];
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
}

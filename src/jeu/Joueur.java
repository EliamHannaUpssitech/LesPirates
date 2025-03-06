package jeu;

import cartes.Banc;
import cartes.Carte;
import cartes.Main;

public class Joueur {
	private String nom;
	private int vie;
	private int popularite;
	private Main main;
	private Banc banc;

	public Joueur(String nom, Main main, Banc banc) {
		this.nom = nom;
		vie = 5;
		popularite = 0;
		this.main = main;
		this.banc = banc;
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
	
	public void afficheMain() {
		main.afficheMain();
	}
	
	public void afficheBanc() {
		banc.afficheBanc();
	}
	
	public Carte choixCarte(int index) {
		return choixCarte(index);
	}
}

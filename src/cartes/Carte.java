package cartes;

import jeu.Joueur;

public abstract class Carte {
	private Effet effet;
	
	public Carte(Effet effet) {
		this.effet = effet;
	}
	
	public String getNom() {
		return effet.toString();
	}
	
	public String getDesc() {
		return effet.afficheDescription();
	}
	
	public abstract void affectEffet(Joueur joueurUtil, Joueur joueurAdv);
	
	public abstract void removeEffet(Joueur joueurUtil, Joueur joueurAdv);
}

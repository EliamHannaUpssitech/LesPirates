package cartes;

import jeu.Joueur;

public class Carte {
	private Effet effet;
	private int affectVie;
	private int affectPopularite;
	
	public Carte(Effet effet, int affectVie, int affectPopularite) {
		this.effet = effet;
		this.affectVie = affectVie;
		this.affectPopularite = affectPopularite;
	}
	
	public String getNom() {
		return effet.toString();
	}
	
	public void affectEffet(Joueur joueurUtil, Joueur joueurAdv) {
		if(effet.toInt() == 0) {
			joueurUtil.affectVie(affectVie);
			joueurUtil.affectPopularite(affectPopularite);
		}else {
			joueurAdv.affectVie(affectVie);
			joueurAdv.affectPopularite(affectPopularite);
		}
	}
}

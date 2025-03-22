package cartes;

import jeu.Joueur;

public class Banc {
	private Carte banc[] = new Carte[5];
	private int nbCartes = 0;
	
	public Banc() {
		for(int i=0; i<5; i++) {
			this.banc[i] = null;
		}
	}
	
	public Carte getBanc(int idCarte) {
		return banc[idCarte];
	}
	
	public int getNbCartes() {
		return nbCartes;
	}
	
	public void jouerCarte(Carte carte, int index, Joueur joueurUtil, Joueur joueurAdv) {
		if(banc[index-1] != null) {
			banc[index-1].removeEffet(joueurUtil, joueurAdv);
		}
		banc[index-1] = carte;
		carte.affectEffet(joueurUtil, joueurAdv);
	}
	
	public String afficheBanc() {
		String afficheurBanc = "\tBanc :";
		for(int i=0; i<5; i++) {
			afficheurBanc += " " + (i+1) + ".";
			if(banc[i] != null) {
				afficheurBanc += banc[i].getNom();
			}else {
				afficheurBanc += "/";
			}
		}
		afficheurBanc += "\n";
		return afficheurBanc;
	}
}

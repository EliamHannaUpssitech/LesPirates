package cartes;

import java.util.Random;

import effets.AttaqueDirecte;
import effets.BouletDeCanon;
import effets.GainPopularite;
import effets.Omnicience;
import effets.PopulariteUltime;
import effets.PropageRumeur;
import effets.Roulette;
import effets.SoinVie;

public class Pioche {
	private Carte pioche[] = new Carte[40];
	private int nbCartePioche = 40;
	
	public Pioche() {
		
		initPioche();
		
		Random rand = new Random();
        for (int i = nbCartePioche - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            Carte temp = pioche[i];
            pioche[i] = pioche[index];
            pioche[index] = temp;
        }
	}
	
	public String afficherPioche() {
		String affichagePioche = "";
		for(int i=0; i<nbCartePioche; i++) {
			affichagePioche += i+1 + " : " + pioche[i].getNom() + "\n";
		}
		return affichagePioche;
	}
	
	public Carte piocher() {
		Carte cartePiochee = pioche[nbCartePioche-1];
		pioche[nbCartePioche-1] = null;
		nbCartePioche--;
		return cartePiochee;
	}
	
	public void initPioche() {
		for(int i=0; i<9; i++) {
			pioche[i] = new GainPopularite(Effet.GAINPOPULARITE);
		}
		for(int i=9; i<18; i++) {
			pioche[i] = new AttaqueDirecte(Effet.ATTAQUEDIRECTE);
		}
		for(int i=18; i<22; i++) {
			pioche[i] = new PopulariteUltime(Effet.POPULARITEULTIME);
		}
		for(int i=22; i<26; i++) {
			pioche[i] = new BouletDeCanon(Effet.BOULETDECANON);
		}
		for(int i=26; i<29; i++) {
			pioche[i] = new SoinVie(Effet.SOINVIE);
		}
		for(int i=29; i<32; i++) {
			pioche[i] = new PropageRumeur(Effet.PROPAGERUMEUR);
		}
		for(int i=32; i<36; i++) {
			pioche[i] = new Omnicience(Effet.OMNICIENCE);
		}
		for(int i=36; i<40; i++) {
			pioche[i] = new Roulette(Effet.ROULETTE);
		}
		
	}
}

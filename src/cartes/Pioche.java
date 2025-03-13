package cartes;

import java.util.Random;

import effets.AttaqueDirecte;
import effets.GainPopularite;
import effets.Omnicience;
import effets.PropageRumeur;
import effets.SoinVie;

public class Pioche {
	private Carte pioche[] = new Carte[40];
	private int nbCartePioche = 40;
	
	public Pioche() {
		
		initPioche();
		
		// Mélange de la pioche
		Random rand = new Random();
        for (int i = nbCartePioche - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            Carte temp = pioche[i];
            pioche[i] = pioche[index];
            pioche[index] = temp;
        }
	}
	
	public void afficherPioche() {
		for(int i=0; i<nbCartePioche; i++) {
			System.out.println(i+1 + " : " + pioche[i].getNom());
		}
	}
	
	public Carte piocher() {
		Carte cartePiochee = pioche[nbCartePioche-1];
		pioche[nbCartePioche-1] = null;
		nbCartePioche--;
		return cartePiochee;
	}
	
	public void initPioche() {
		for(int i=0; i<15; i++) {
			pioche[i] = new GainPopularite(Effet.GAINPOPULARITE);	// 15 cartes
		}
		for(int i=15; i<30; i++) {
			pioche[i] = new AttaqueDirecte(Effet.ATTAQUEDIRECTE);	// 15 cartes
		}
		for(int i=30; i<33; i++) {
			pioche[i] = new SoinVie(Effet.SOINVIE);					// 3 cartes
		}
		for(int i=33; i<36; i++) {
			pioche[i] = new PropageRumeur(Effet.PROPAGERUMEUR);		// 3 cartes
		}
		for(int i=36; i<40; i++) {
			pioche[i] = new Omnicience(Effet.OMNICIENCE);			// 4 cartes
		}
		
	}
}

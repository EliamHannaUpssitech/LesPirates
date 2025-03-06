package cartes;

import java.util.Random;

public class Pioche {
	private Carte pioche[] = new Carte[40];
	private int nbCartePioche = 40;
	
	public Pioche() {
		for(int i=0; i<20; i++) {
			pioche[i] = new Carte(Effet.GAINPOPULARITE, 0, 1);
		}
		for(int i=20; i<40; i++) {
			pioche[i] = new Carte(Effet.ATTAQUEDIRECTE, -1, 0);
		}
		
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
}

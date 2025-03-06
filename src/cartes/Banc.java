package cartes;

public class Banc {
	private Carte banc[] = new Carte[5];
	private int nbCartes = 0;
	
	public Banc() {
		
	}
	
	public Carte getBanc(int idCarte) {
		return banc[idCarte];
	}
	
	public int getNbCartes() {
		return nbCartes;
	}
	
	public void afficheBanc() {
		System.out.print("Banc :");
		for(int i=0; i<5; i++) {
			if(banc[i] != null) {
				System.out.print(" " + (i+1) + "." + banc[i].getNom());
			}
		}
		System.out.print("\n");
	}
}

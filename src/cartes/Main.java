package cartes;

public class Main {
	private Carte main[] = new Carte[5];
	private int nbCartes = 5;
	
	public Main(Pioche pioche) {
		for(int i=0; i<4; i++) {
			this.main[i] = pioche.piocher();
		}
	}
	
	public Carte getMain(int idCarte) {
		return main[idCarte];
	}
	
	public int getNbCartes() {
		return nbCartes;
	}
	
	public void afficheMain() {
		System.out.print("Main :");
		for(int i=0; i<5; i++) {
			if(main[i] != null) {
				System.out.print(" " + (i+1) + "." + main[i].getNom());
			}
		}
		System.out.print("\n");
	}
	
	public void ajouterCarte(Carte carte) {
		main[4] = carte;
	}
	
	public Carte choixCarte(int index) {
		Carte carteChoix = main[index-1];
		main[index-1] = null;
		// AJOUT D'UN DECALAGE
		return carteChoix;
	}
}

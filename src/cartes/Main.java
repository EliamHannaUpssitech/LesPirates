package cartes;

public class Main {
	private Carte main[] = new Carte[5];
	private int nbCartes = 5;
	private int idCarteJouee = 4;
	
	public Main(Pioche pioche) {
		for(int i=0; i<4; i++) {
			this.main[i] = pioche.piocher();
		}
		this.main[4] = null;
	}
	
	public Carte getMain(int idCarte) {
		return main[idCarte];
	}
	
	public int getNbCartes() {
		return nbCartes;
	}
	
	public String afficheMain() {
		String afficheurMain = "\tMain :";
		for(int i=0; i<5; i++) {
			afficheurMain += " " + (i+1) + ".";
			if(main[i] != null) {
				afficheurMain += main[i].getNom();
			}else {
				afficheurMain += "/";
			}
		}
		afficheurMain += "\n";
		return afficheurMain;
	}
	
	public void ajouterCarte(Carte carte) {
		main[idCarteJouee] = carte;
	}
	
	public void jouerCarte(int idCarte) {
		idCarteJouee = idCarte;
		main[idCarteJouee] = null;
	}
	
	public Carte choixCarte(int index) {
		Carte carteChoix = main[index-1];
		main[index-1] = null;
		return carteChoix;
	}
}

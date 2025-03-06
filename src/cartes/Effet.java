package cartes;

public enum Effet {
	GAINPOPULARITE("Gain Popularite", 0, "Le joueur gagne de la popularite"), 
	ATTAQUEDIRECTE("Attaque Directe", 1, "Le joueur attaque l'adversaire");
	
	private String nomEffet;
	private int type;
	private String description;
	
	private Effet(String nomEffet, int type, String description) {	// type = 0 passif || type = 1 attaque
		this.nomEffet = nomEffet;
		this.type = type;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return nomEffet;
	}
	
	public int toInt() {
		return type;
	}
	
	public String afficheDescription() {
		return description;
	}
}

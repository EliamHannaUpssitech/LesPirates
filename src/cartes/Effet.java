package cartes;

public enum Effet {
	GAINPOPULARITE("Gain Popularite", "Le joueur gagne de la popularite"),
	PROPAGERUMEUR("Propage Rumeur", "Le joueur perd de la popularite"),
	SOINVIE("Soin Vie", "Le joueur se soigne de la vie"),
	ATTAQUEDIRECTE("Attaque Directe", "Le joueur attaque l'adversaire"),
	OMNICIENCE("Omnicience", "Vous regardez la main de l'adversaire"),
	ROULETTE("Roulette", "Le joueur gagne 2 popularité ou perd 2 vies (50%)");
	
	private String nomEffet;
	private String description;
	
	private Effet(String nomEffet, String description) {
		this.nomEffet = nomEffet;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return nomEffet;
	}
	
	public String afficheDescription() {
		return description;
	}
}

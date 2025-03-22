package cartes;

public enum Effet {
	GAINPOPULARITE("Gain Popularite", "Le joueur gagne 1 point de popularite"),
	PROPAGERUMEUR("Propage Rumeur", "Le joueur perd 1 point de popularite"),
	SOINVIE("Soin Vie", "\tLe joueur recupere 1 point de vie"),
	ATTAQUEDIRECTE("Attaque Directe", "Le joueur attaque l'adversaire pour 1 point de vie"),
	OMNICIENCE("Omnicience", "\tVous regardez la main de l'adversaire"),
	ROULETTE("Roulette", "\tLe joueur gagne 2 popularité ou perd 2 vies (50%)"),
	POPULARITEULTIME("Popularite Ultime", "Le joueur gagne 2 point de popularite"),
	BOULETDECANON("Boulet de Canon", "Le joueur attaque l'adversaire pour 2 point de vie");
	
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

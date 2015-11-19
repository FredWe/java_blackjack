public class Carte {

	private Integer valeur;

	private String enseigne;
	
	public Integer getValeur() {
		return this.valeur;
	}
	public void setValeur(Integer v) throws IllegalArgumentException {
		if (v < 1 || v > 13)
			throw new IllegalArgumentException("La valeur de carte doit entre [1,13]");
		else 
			this.valeur = v;
	}
	public String getEnseigne() {
		return this.enseigne;
	}
	public void setEnseigne(String e) throws IllegalArgumentException {
		if (e.equalsIgnoreCase("Carreau") 
				|| e.equalsIgnoreCase("Coeur") 
				|| e.equalsIgnoreCase("Pique")
				|| e.equalsIgnoreCase("Trefle"))
			this.enseigne = e.toUpperCase();
		else
			throw new IllegalArgumentException("L'enseigne de carte doit etre compris dans {\"Carreau\",\"Coeur\",\"Pique\",\"Trefle\"}");
	}
}
import java.util.Vector;

public abstract class AbstractJoueur {
	
	private Boolean enabledNouvelleCarte; // Demander nouvelle carte ou pas
	public String resultat; // "Win", "Lost", "Tie" (to Banque)
	public Strategy myStrategy;
	public Vector<Carte> myCarte;
    
    /*public AbstractJoueur(){
        this.myCarte = new Vector<Carte>();
        this.somme=0;
    }*/
	
	public AbstractJoueur(Strategy s){
		this.myCarte = new Vector<Carte>();
		this.myStrategy = s;
	}
	public void choisirStrategy(String str) throws IllegalArgumentException { //"Aleatoire","Seuil","Humain"
		switch (str.toUpperCase()){
			case "ALEATOIRE" :
				this.myStrategy = new StrategyAleatoire();
				break;
			case "SEUIL" :
				this.myStrategy = new StrategySeuil();
				break;
			case "HUMAIN" :
				this.myStrategy = new StrategyHumain();
				break;
			default :
				throw new IllegalArgumentException("Le Strategie doit etre compris dans {\"Aleatoire\",\"Seuil\",\"Humain\"}");
		}
	}
	public void deciderDemanderNouvelleCarte(){
		try {
			this.enabledNouvelleCarte = this.myStrategy.deciderDemanderCarte(this.calculerSomme());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public Boolean consulterFlagNouvelleCarte(){
		return this.enabledNouvelleCarte;
	}
	public String getResultat(){
		//TODO
		return "toto";
	}
	public void setResultat(String s){
		//TODO
	}
    public int calculerSomme(){
        Integer somme = 0;
        Carte thisCarte;
        for(int i=0; i<myCarte.size(); i++){
            thisCarte = this.myCarte.elementAt(i);
            somme += thisCarte.getValeur();
        }
        return somme;
	}

}
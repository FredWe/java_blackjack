import java.util.Vector;
import java.util.Scanner;

public abstract class AbstractJoueur {
	
	private Boolean enabledNouvelleCarte; // Demander nouvelle carte ou pas
	public String resultat; // "Win", "Lost", "Tie" (to Banque)
	public Strategy myStrategy;
	public Vector<Carte> myCarte;
    
    /*public AbstractJoueur(){
        this.myCarte = new Vector<Carte>();
        this.somme=0;
    }*/
	public Vector<Carte> getMyCarte(){
		return this.myCarte;
	}
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
				System.out.println("Entrer une Seuil pour decider Demander ou Abandonner une nouvelle carte.");
				Scanner sc = new Scanner(System.in);
				Integer seuil = sc.nextInt();
				sc.close();
				this.myStrategy = new StrategySeuil(seuil);
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
		return this.resultat;
	}
	public void setResultat(String s){
		if (s.equalsIgnoreCase("Win") 
				|| s.equalsIgnoreCase("Lost") 
				|| s.equalsIgnoreCase("Tie"))
			this.resultat = s.toUpperCase();
		else
			throw new IllegalArgumentException("Le resultat doit etre compris dans {\"Win\", \"Lost\", \"Tie\"\"}");
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
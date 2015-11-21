import java.util.Vector;
import java.io.IOException;

public abstract class AbstractJoueur {
	
	private Boolean enabledNouvelleCarte; //demander nouvelle carte ou pas
	public String resultat; //"Win","Lost","Tie" (to Banque)

	public Integer somme;

	public Strategy myStrategy;

	public Vector<Carte> myCarte;
    
    public AbstractJoueur(){
        this.myCarte = new Vector<Carte>();
        this.somme=0;
    }
	
	public AbstractJoueur(){
		this.myCarte = new Vector<Carte>();
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
			this.enabledNouvelleCarte = this.myStrategy.deciderDemanderCarte();
		} catch (IllegalArgumentException | IOException e) {
			e.printStackTrace();
			try {
				this.enabledNouvelleCarte = this.myStrategy.deciderDemanderCarte(this.somme);
			} catch (IllegalArgumentException | IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	public void demanderCarte() {
        this.enabledNouvelleCarte = true;
	}
	public void arreterDeDemanderCarte(){
		this.enabledNouvelleCarte = false;
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
        
        Carte thisCarte;
        for(int i=0;i<myCarte.size()  ;i++){
            thisCarte = this.myCarte.elementAt(i);
            somme=somme+thisCarte.getValeur();
        }
        return this.somme;
	}

}
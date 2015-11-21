import java.util.Vector;
import java.util.Scanner;
import java.util.*;

public abstract class AbstractJoueur {
	
	public Boolean enableNouvelleCarte; //demander nouvelle carte ou pas
	public String resultat; //"Win","Lost","Tie" (to Banque)

	public Integer somme;

	public Strategy myStrategy;

	public Vector<Carte> myCarte;
    
    public AbstractJoueur(){
        this.myCarte = new Vector<Carte>();
        this.somme=0;
    }
	

	public void choisirStrategy(String str) throws IllegalArgumentException { //"Aleatoire","Seuil","Humain"
		switch (str.toUpperCase()){
			case "ALEATOIRE" :
				break;
			case "SEUIL" :
				break;
			case "HUMAIN" :
				break;
			default :
				throw new IllegalArgumentException("Le Strategie doit etre compris dans {\"Aleatoire\",\"Seuil\",\"Humain\"}");
		}

        
	}
    
	public void demanderCarte() {
        
	}

	public void arreterDeDemanderCarte(){

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
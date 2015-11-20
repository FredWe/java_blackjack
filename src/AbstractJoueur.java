import java.util.Vector;
import java.util.Scanner;
import java.util.*;

public abstract class AbstractJoueur {

	public Vector<Carte> carte;

	public String resultat;

	public Integer somme;

	public Strategy myStrategy;
	public Vector DistribuerLaCarte;
	public Vector myCarte;
	

	public void choisirStrategy(){
        
        int i;
        
        System.out.println("Choisir votre strategy!!!");
        System.out.println("Choix 1: strategy Aléatoire");
        System.out.println("Choix 2: strategy Seuil");
        System.out.println("Choix 3: strategy Humain");
        
        
        
        
	}
	public void demanderCarte() {
        
	}

	public int arreterDeDemanderCarte(){
    
	}

	public int calculerSomme(){
        
        for(int i=0;i<sizeof(myCarte);i++)){
            somme=somme+myCarte(i).getValeur();
        }
        return somme;
	}

}
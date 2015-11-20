import java.util.Vector;
import java.util.Scanner;
import java.util.*;

public abstract class AbstractJoueur {

	public Vector<Carte> carte;

	public String resultat;

	public Integer somme;

	public Strategy myStrategy;
	public Vector DistribuerLaCarte;
	public Vector<Carte> myCarte;
	

	public void choisirStrategy(){
        
        int i;
        System.out.println("Choisir votre strategy!!!");
        System.out.println("Choix 1: strategy Aléatoire");
        System.out.println("Choix 2: strategy Seuil");
        System.out.println("Choix 3: strategy Humain");
        
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();
        
        switch(i){
                
            case 1:
                System.out.println("Vous avez choisi le strategy Aléatoire");
                // Strategy Aleatoire
            case 2:
                System.out.println("Vous avez choisi le strategy Seuil");
                // Strategy Seuil
            case 3:
                System.out.println("Vous avez choisi le strategy Humain");
                // Strategy Humain
            default:
                System.out.println("Bien saisir le chiffre.");
                break;
        }
        
	}
    
	public void demanderCarte() {
        
	}

	public void arreterDeDemanderCarte(){
        
	}

	public int calculerSomme(){
        
        for(int i=0;i<myCarte.capacity() ;i++){
            somme=somme+myCarte.elementAt(i).getValeur();
        }
        return somme;
	}

}
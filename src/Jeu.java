import java.util.Vector;
import java.util.Scanner;
import java.util.*;



public class Jeu {

	public Cropier cropier;

	public Banque banque;

	public Joueur joueur;

	public Vector myJoueur;
    
    
    public Joueur ajouterJoueur(){
        
        
    
        
    }
    
    public void ChoisirPersonne(){
        
        int i;
        System.out.println("choisir combien personne participe BlackJack");
        System.out.println("choix 1: Une personne");
        System.out.println("choix 2: Deux personne");
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();
        
        switch(i){
                
            case 1:
                System.out.println("Vous avez choisi une personnes");
                Joueur v= new
                
            case 2:
                System.out.println("Vous avez choisi deux personnes");
                
            default:
                System.out.println("Bien saisir le chiffre svp.");
                break;
        }
        
    }
    
    
    public void calculerResultat(){

        int somme=0;
    
        
        
        
        
        
        
	}

}
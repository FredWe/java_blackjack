import java.util.Vector;
import java.util.Scanner;
import java.util.*;



public class Jeu {

	public Cropier cropier;

	public Banque banque;

	public Joueur joueur;

	public Vector myJoueur;
    
   /* public void ChoisirPersonne(){
        
        int i;
        System.out.println("choisir combien personne participe BlackJack");
        System.out.println("choix 1: Une personne");
        System.out.println("choix 2: Deux personne");
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();

        switch(i){
                
            case 1:
                System.out.println("Vous avez choisi une personnes");
                Joueur v= new Joueur();
                break;
            case 2:
                System.out.println("Vous avez choisi deux personnes");
                Joueur v1= new Joueur();
                Joueur v2= new Joueur();
                break;
            default:
                System.out.println("Bien saisir le chiffre svp.");
                break;
                
        }
    }*/
    
    public void calculerResultat(Joueur v){

        
        if(banque.calculerSomme()>21){
            if(v.calculerSomme()<=21){
                System.out.println("Joueur" + v.getNom() + "a gagné");
                v.resultat="Win";
                
            }
            else{
                System.out.println("Match NULL");
                 v.resultat="Tie";
            }
            
        }
        else{
            
            if(v.calculerSomme() == banque.calculerSomme()){
                System.out.println("Match NULL");
                v.resultat="Tie";
            }
            else if(v.calculerSomme()<banque.calculerSomme() || v.calculerSomme()>21){
                System.out.println("Vous avez perdu");
                v.resultat="Lost";
                
            }
            else if(v.calculerSomme()<=21&&v.calculerSomme()<banque.calculerSomme()){
                System.out.println("Joueur" + v.getNom() + "a gagné");
                v.resultat="Win";
            }
            else return;
                
                
        }
        
            
    }
    

}
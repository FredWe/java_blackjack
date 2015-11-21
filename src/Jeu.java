import java.util.Vector;
import java.util.Scanner;
import java.util.*;



public class Jeu {

	public Cropier cropier;

	public Banque banque;
    
	public Vector myJoueur;
    
    public Jeu(){
        Banque  banque=new Banque(new StrategyAleatoire());
        Cropier cropier=new Cropier();
        Vector  myJoueur=new Vector();
        
        
    }
    
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
    
    public void calculerResultat(Joueur v,Banque banque){
        
        
        
       /* System.out.println("Tester calculerResultat");
        System.out.println(banque);
        System.out.println("la valeur banque"+ (banque.myCarte.get(0)).getValeur());
        System.out.println("Le Somme: " +banque.calculerSomme());*/
        
        
        if(banque.calculerSomme()>21){
            if(v.calculerSomme()<=21){
                System.out.println(" Joueur " + v.getNom() + " a gagné");
                v.resultat="Win";
                
            }
            else{
                System.out.println(v.getNom()+ " et Banque" + " sont Match NULL");
                 v.resultat="Tie";
            }
        }
        else{
            
            if(v.calculerSomme() == banque.calculerSomme()){
                System.out.println(v.getNom()+ " et Banque" +" sont Match NULL.");
                v.resultat="Tie";
            }
            else if(v.calculerSomme()<banque.calculerSomme() || v.calculerSomme()>21){
                System.out.println(" Vous avez perdu " + v.getNom());
                v.resultat="Lost";
                
            }
            else if((v.calculerSomme()<=21) && (v.calculerSomme()>banque.calculerSomme())){
                System.out.println(" Joueur " + v.getNom() + " a gagné");
                v.resultat="Win";
            }
            
            else return;
                
        }
            
    }
    

}
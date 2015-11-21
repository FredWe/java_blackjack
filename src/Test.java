import java.util.Vector;
import java.util.Scanner;
import java.util.*;


public class Test {

        public static void main(String[] args) {
        
        System.out.println("Hello world, Let's begin\n");
        Jeu nv=new Jeu();
        
        Cropier nvCrop=new Cropier();
        nvCrop.initCarte();
        
        Banque bq=new Banque();
            
            
        
        // Choisir nombre de personnes.
            
    
        System.out.println("choisir combien personne participe BlackJack");
        System.out.println("choix 1: Une personne");
        System.out.println("choix 2: Deux personne");
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        Joueur j=null;
        Joueur j1=null;
        Joueur j2=null;
            
        switch(i){
                    
            case 1:
                System.out.println("Vous avez choisi une personnes");
                j= new Joueur();
                break;
            case 2:
                System.out.println("Vous avez choisi deux personnes");
                j1= new Joueur();
                j2= new Joueur();
                break;
            default:
                System.out.println("Bien saisir le chiffre svp.");
                break;
        }
            
            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("");
            
            
            /* for(int jj=0;jj<52;jj++){
                System.out.println("La valeur de carte est: " +nvCrop.myCarte.get(jj).getValeur() );
            }*/
            
            nvCrop.initCarte();
            nvCrop.distribuerCarte(j1);
            nvCrop.distribuerCarte(j2);
            nvCrop.distribuerCarte(j2);
            nvCrop.distribuerCarte(bq);
            nvCrop.distribuerCarte(bq);
            
            System.out.println("La valeur de carte est: " +j2.myCarte.get(0).getValeur());
            System.out.println("La valeur de carte est: " +j2.myCarte.get(1).getValeur());
            System.out.println("Le somme de carte est: " +j2.calculerSomme());
            
            
            nv.calculerResultat(j1);
            nv.calculerResultat(j2);
            
            
            
            
            
            
            
            //Object set(int index, Object element)
            //void add(int index, Object element)
            //String str=j1.getNom();
            //System.out.println("le nom de joueur" + str);
            //j1.myCarte.set(0,1);
            //j1.myCarte.set(1,21);
            //nv.calculerResultat(j1);
            
        }

}


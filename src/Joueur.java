import java.util.Vector;
import java.util.Scanner;
import java.util.*;



public class Joueur extends AbstractJoueur {

	public String nom;
    
    public Joueur(){
        
        this.nom=setNom();
    }
    
    public String setNom(){
        
        String str;
        System.out.println("Saisir le nom de joueur");
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        return str;
    }
    public String getNom(){
        return this.nom;
    }
    
}
import java.util.Scanner;

public class Joueur extends AbstractJoueur {

	public String nom;
	private Scanner sc;
    
    public Joueur(){
        this.nom=setNom();
    }
    
    public String setNom(){
        
        String str;
        System.out.println("Saisir le nom de joueur");
        sc = new Scanner(System.in);
        str=sc.nextLine();
        return str;
    }
    public String getNom(){
        return this.nom;
    }
    
}
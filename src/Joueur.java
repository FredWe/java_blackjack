import java.util.Scanner;

public class Joueur extends AbstractJoueur implements Cloneable{

	public String nom;
    
	public Joueur(Strategy s){
        super(s);
        this.nom=setNom();
	}
    public String setNom(){
        System.out.println("Saisir le nom de joueur : ");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	this.nom = sc.nextLine();
        return this.nom;
    }
    public String getNom(){
        return this.nom;
    }
    
}
import java.util.Scanner;

public class Joueur extends AbstractJoueur {

	public String nom;
	private Scanner sc;
    
    /*public Joueur(){
        this.nom=setNom();
    }*/
	public Joueur(Strategy s){
        super(s);
        this.nom=setNom();
	}
    
    public String setNom(){
        System.out.println("Saisir le nom de joueur :");
        sc = new Scanner(System.in);
        this.nom = sc.nextLine();
        return this.nom;
    }
    public String getNom(){
        return this.nom;
    }
    
}
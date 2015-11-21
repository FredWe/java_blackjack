import java.util.Scanner;

public class Joueur extends AbstractJoueur {

	public String nom;
    
    /*public Joueur(){
        this.nom=setNom();
    }*/
	public Joueur(Strategy s){
        super(s);
        this.nom=setNom();
	}
    
    public String setNom(){
        System.out.println("Saisir le nom de joueur :");
        Scanner sc = new Scanner(System.in);
        this.nom = sc.nextLine();
        sc.close();
        return this.nom;
    }
    public String getNom(){
        return this.nom;
    }
    
}
import java.util.Vector;

public abstract class AbstractJoueur {

	public java.util.Vector<Carte> carte;

	public String resultat;

	public Integer somme;

	public Strategy myStrategy;
	public Vector DistribuerLaCarte;
	public Vector myCarte;
	/**
	 * 
	 * @element-type Carte
	 */
	public Vector Possède;

	public void choisirStrategy() {
	}

	public void demanderCarte() {
	}

	public void arreterDeDemanderCarte() {
	}

	public void calculerSomme() {
	}

}
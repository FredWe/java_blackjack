import java.util.*;

public class Jeu {

	public Cropier myCropier;
	public Banque myBanque;
	public Vector<Joueur> myJoueur;
	public Boolean flagContinuer;
    
    public Jeu(){
        this.myBanque = null;
        this.myCropier = null;
        this.myJoueur = new Vector<Joueur>();
        this.flagContinuer = true;
    }
    public void joinMember(Object element) {
    	if(element.getClass().getSimpleName() == "Cropier") {
    		this.myCropier = (Cropier) element;
    	}else if(element.getClass().getSimpleName() == "Banque") {
    		this.myBanque = (Banque) element;
    	}else if(element.getClass().getSimpleName() == "Joueur") {
    		this.myJoueur.addElement((Joueur) element);
    	}else {
    		throw new IllegalArgumentException("Don't join an element of a whatever type !!\n"
    				+ "Argument de join() doit etre compris dans {\"Cropier\", \"Banque\", \"Joueur\"}");
    	}
    }
    public void initJeu(){
		Iterator<Joueur> iter = this.myJoueur.iterator();
		Joueur thisJoueur;
		while(iter.hasNext()){
			thisJoueur = iter.next();
			thisJoueur.getMyCarte().clear();
		}
		this.myBanque.getMyCarte().clear();
    	this.myCropier.initCarte();
    	for(int i=0; i<2; i++){
    		iter = this.myJoueur.iterator();
    		while(iter.hasNext()){
    			thisJoueur = iter.next();
    			this.myCropier.distribuerCarte(thisJoueur);
    		}
    		this.myCropier.distribuerCarte(this.myBanque);
    	}
    }
    public void tourJeu(){
		Iterator<Joueur> iter = this.myJoueur.iterator();
		Joueur thisJoueur;
		Boolean tempFlag = false;
		while(iter.hasNext()) {
			thisJoueur = iter.next();
			thisJoueur.deciderDemanderNouvelleCarte();
			if(thisJoueur.consulterFlagNouvelleCarte()) {
				this.myCropier.distribuerCarte(thisJoueur);
			}
			tempFlag = tempFlag || thisJoueur.consulterFlagNouvelleCarte();
		}
		this.myBanque.deciderDemanderNouvelleCarte();
		if(this.myBanque.consulterFlagNouvelleCarte()) {
			this.myCropier.distribuerCarte(this.myBanque);
		}
		tempFlag = tempFlag || this.myBanque.consulterFlagNouvelleCarte();
		this.flagContinuer = tempFlag;
    }
    public void effectuerJeu() {
    	while(this.flagContinuer){
    		this.tourJeu();
    	}
		Iterator<Joueur> iter = this.myJoueur.iterator();
		Joueur thisJoueur;
		while(iter.hasNext()) {
			thisJoueur = iter.next();
			try {
				this.calculerResultat(thisJoueur, this.myBanque);
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
    }
    public void showResultat() throws NoSuchFieldException{
    	System.out.println("\nLe somme de myBanque est :\t" + this.myBanque.calculerSomme());
		Iterator<Joueur> iter = this.myJoueur.iterator();
		Joueur thisJoueur;
		while(iter.hasNext()){
			thisJoueur = iter.next();
			System.out.println("\nLe somme de " + thisJoueur.getNom() + 
					" est :\t" + thisJoueur.calculerSomme());
			String result = thisJoueur.getResultat();
			if (result.equalsIgnoreCase("Win")) {
				System.out.println("\nJoueur " + thisJoueur.getNom() + " a gagné.");
			}else if (result.equalsIgnoreCase("Lost")) {
				System.out.println("\nVous avez perdu ->_-> " + thisJoueur.getNom());
			}else if (result.equalsIgnoreCase("Tie")) {
				System.out.println("\nJoueur " + thisJoueur.getNom()+ " et Banque" + " fait Match NULL.");
			}else {
				throw new NoSuchFieldException("No such Resultat, Resultat doit etre compris dans"
						+ "{\"Win\", \"Lost\", \"Tie\"}");
			}
		}
    }
    
    public void calculerResultat(Joueur v, Banque myB) throws NoSuchMethodException{	
          
        if(myB.calculerSomme() > 21) {
            if(v.calculerSomme() <= 21) {
                v.setResultat("Win");
            }else {
                v.setResultat("Tie");
            }
        }else {  
            if(v.calculerSomme() == myB.calculerSomme()) {
                v.setResultat("Tie");
            }else if(v.calculerSomme() < myB.calculerSomme() || v.calculerSomme() > 21) {
                v.setResultat("Lost");
            }else if(v.calculerSomme() > myB.calculerSomme()) {
                v.setResultat("Win");
            }else {
            	throw new NoSuchMethodException("Not a handled situation");
            }
        }          
    }
    

}
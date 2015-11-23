import java.util.Iterator;
import java.util.Vector;

public class JeuTest {
	public static void showCarte(Vector<Carte> vca){
		System.out.println("getMyCarte().size() : " + 
				vca.size());
		Iterator<Carte> iter = vca.iterator();
		Carte thisCarte;
		while(iter.hasNext()){
			thisCarte = iter.next();
			System.out.println("indexOf(thisCarte) : " + 
					vca.indexOf(thisCarte));
			System.out.println(thisCarte.getEnseigne() + 
					" " + thisCarte.getValeur());
		}
	}
	public static void showPlayers(Jeu j){
		System.out.println("\n\nflagContinuer :\t" + j.flagContinuer);
		System.out.println(j.myCropier);
		showCarte(j.myCropier.getMyCarte());
		System.out.println("\n"+j.myBanque);
		showCarte(j.myBanque.getMyCarte());
		System.out.println("consulterFlagNouvelleCarte() :\t" + j.myBanque.consulterFlagNouvelleCarte());
		System.out.println("\n"+j.myJoueur.elementAt(0));
		showCarte(j.myJoueur.elementAt(0).getMyCarte());
		System.out.println("consulterFlagNouvelleCarte() :\t" + j.myJoueur.elementAt(0).consulterFlagNouvelleCarte());
		System.out.println("\n"+j.myJoueur.elementAt(1));
		showCarte(j.myJoueur.elementAt(1).getMyCarte());
		System.out.println("consulterFlagNouvelleCarte() :\t" + j.myJoueur.elementAt(1).consulterFlagNouvelleCarte());
	}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World\n");
		Cropier c0 = new Cropier();
		Banque b0 = new Banque(new StrategyAleatoire());
		Joueur j0 = new Joueur(new StrategyAleatoire());
		c0.initCarte();
		System.out.println("showCarte(c0.getMyCarte()); ---> \n");
		showCarte(c0.getMyCarte());
		System.out.println("showCarte(b0.getMyCarte()); ---> \n");
		showCarte(b0.getMyCarte());
		System.out.println("showCarte(j0.getMyCarte()); ---> \n");
		showCarte(j0.getMyCarte());
		Jeu jeu0 = new Jeu();
		System.out.println(c0.getClass().getSimpleName());
		System.out.println(c0);
		System.out.println(b0.getClass().getSimpleName());
		System.out.println(b0);
		System.out.println(j0.getClass().getSimpleName());
		System.out.println(j0 + "\n");
		jeu0.joinMember(c0);
		jeu0.joinMember(b0);
		jeu0.joinMember(j0);
		
		System.out.println(jeu0.myCropier);
		System.out.println(jeu0.myBanque);
		System.out.println(jeu0.myJoueur.elementAt(0) + "\n");	
		
		Joueur j1 = new Joueur(new StrategyAleatoire());
		jeu0.joinMember(j1);
		
		jeu0.initJeu();
		System.out.println("=============InitJeu===========");
		showPlayers(jeu0);
		
		jeu0.tourJeu();
		showPlayers(jeu0);
		
		jeu0.effectuerJeu();
		showPlayers(jeu0);
		
		try {
			jeu0.showResultat();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TODO
		//choisir nombre de personnes
		// choisir le strategy
		Jeu jeu1 = new Jeu();
		b0.choisirStrategy("Seuil");
		j0.choisirStrategy("Humain");
		j1.choisirStrategy("Aleatoire");
		jeu1.joinMember(c0);
		jeu1.joinMember(b0);
		jeu1.joinMember(j0);
		jeu1.joinMember(j1);
		
		jeu1.initJeu();
		System.out.println("=============InitJeu===========");
		showPlayers(jeu1);
		
		jeu1.tourJeu();
		showPlayers(jeu1);
		
		jeu1.effectuerJeu();
		showPlayers(jeu1);
		
		try {
			jeu1.showResultat();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/

}

import java.util.Vector;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
        int nbp=0;
        String str;
        
        System.out.println("Bienvenu notre jeu BlackJack 21");
        System.out.println("      Weidong & Li Chenggen     ");
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("1) Choisir nombre de personnes, saisir le chiffre.");
        System.out.println("2) Choisir Strategy taper 'Seuil','Aleatoire','Humain'");
        
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        nbp = sc.nextInt();
        
        Vector<Joueur> vj = new Vector<Joueur>();
        
        for(int i=0; i<nbp; i++){
            Joueur j = new Joueur(new StrategyAleatoire());
            @SuppressWarnings("resource")
			Scanner sct = new Scanner(System.in);
            str = sct.nextLine();
            j.choisirStrategy(str);
            vj.addElement(j);
        }
        
        
        Cropier nvCrop=new Cropier();
        Banque bq=new Banque(new StrategyAleatoire());
        Jeu nv =new Jeu();
        nv.joinMember(nvCrop);
        nv.joinMember(bq);
        for(int jj=0; jj< nbp ;jj++){
            nv.joinMember(vj.elementAt(jj));
        }
        nv.initJeu();
		nv.effectuerJeu();
        try {
			nv.showResultat();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
}
}
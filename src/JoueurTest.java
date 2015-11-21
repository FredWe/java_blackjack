
public class JoueurTest {
	public static void testStrategy(AbstractJoueur jo, String str){
        jo.choisirStrategy(str);
        System.out.println("Choisir " + str + " -->");
        for (int i=0; i<3; i++){
            jo.deciderDemanderNouvelleCarte();
            System.out.println("jo demander une nouvelle carte : " + jo.consulterFlagNouvelleCarte());
        }
	}

    public static void main(String[] args) {
        
        System.out.println("Hello world, Let's begin\n");
        Joueur j0 = new Joueur(new StrategyAleatoire());
        j0.setNom();
        System.out.println("le nom de joueur est : " + j0.getNom());
        
        Banque b0 = new Banque(new StrategyAleatoire());
        try{
        	b0.choisirStrategy("toto");
    	}catch(Exception e){
    		System.out.println(e);
    	}
        String[] ss = {"aLeatoire", "hUmain", "sEuil"};
        for (int i=0; i<2; i++){
        	testStrategy(b0, ss[i]);
        }
        
    }

}

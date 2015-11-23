
public class JoueurTest {
	public static void testStrategy(AbstractJoueur jo, String str){
        jo.choisirStrategy(str);
        System.out.println("Choisir " + str + " -->");
        for (int i=0; i<3; i++){
        	try{
        		jo.deciderDemanderNouvelleCarte();
                System.out.println("jo demander une nouvelle carte : " + jo.consulterFlagNouvelleCarte());
        	}catch(Exception e){
        		e.printStackTrace();
        	}
            
        }
	}
/*
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

        for (int i=0; i<b0.myCarte.capacity(); i++){
        	try{
        		b0.myCarte.addElement(new Carte("trefle",i));
        	}catch(Exception e){
        		System.out.println(e);
        	}	
        }
        System.out.println("b0.calculerSomme() : " + b0.calculerSomme());
        
        String[] ss = {"aLeatoire", "hUmain", "sEuil"};
        for (int i=0; i<ss.length; i++){
        	testStrategy(b0, ss[i]);
        }
        
		try{
			j0.setResultat("toto");
		}catch(IllegalArgumentException e){
	         System.out.println(e);
	      }
		String[] ss0 = {"wIn", "lOst", "tIe"};
        for (int i=0; i<ss0.length; i++){
    		j0.setResultat(ss0[i]);
    		System.out.println("j0.getResultat : " + j0.getResultat());
        }

    }
*/
}
